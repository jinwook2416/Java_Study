package collection.list.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> items = new ArrayList<>();

    public void addItem(Item item1) {
        items.add(item1);
    }

    public void displayItems() {
        int total = 0;
        System.out.println("장바구니 상품 출력");
        for (Item item : items) {
            System.out.println("상품명: " + item.getName() +  ", 합계: " + item.getTotalPrice());
            total += item.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + total);
    }
}
