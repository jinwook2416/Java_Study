package lang.wrappper.test;

public class WrapperTest4 {

    public static void main(String[] args) {

        String str = "100";

        Integer integer1 = Integer.valueOf(str);
        int intValue = integer1;
        Integer integer2 = intValue;
        System.out.println("integer1 = " + integer1);
        System.out.println("integer2 = " + intValue);
        System.out.println("integer3 = " + integer2);

    }
}
