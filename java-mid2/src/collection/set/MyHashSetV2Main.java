package collection.set;

import collection.set.member.Member;

public class MyHashSetV2Main {

    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>();
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);
    }
}
