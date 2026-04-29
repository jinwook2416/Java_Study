package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, int amount) {
        cartMap.put(product, cartMap.getOrDefault(product, 0) + amount);
    }

    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> entry : cartMap.entrySet()) {
            System.out.println("상품: " + entry.getKey() + ", 수량: " + entry.getValue());
        }
    }

    public void minus(Product product, int amount) {
        cartMap.put(product, cartMap.getOrDefault(product, cartMap.get(product)) - amount);
        if (cartMap.get(product) <= 0) {
            cartMap.remove(product);
        }
    }
}
