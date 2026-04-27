package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("입력한 정수의 합계: " + getTotal(numbers));
        System.out.println("입력한 정수의 평균: " + getAverage(numbers));
    }

    private static int getTotal(List<Integer> list) {
        int total = 0;
        for (Integer number : list) {
            total += number;
        }
        return total;
    }

    private static double getAverage(List<Integer> list) {
        return (double) getTotal(list) / list.size();
    }
}
