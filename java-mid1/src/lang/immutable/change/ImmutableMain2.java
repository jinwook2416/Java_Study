package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        //계산 이후의 기존 값은 사라짐
        System.out.println("obj1 = " + obj1.getValue());
    }
}
