package lang.string.test;

public class TestString6 {

    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int count = 0;
        while (str.contains(key) == true) {
            str = str.substring(0, str.lastIndexOf(key));
            count++;
        }

        System.out.println("count = " + count);
    }
}
