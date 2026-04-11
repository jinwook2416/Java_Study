package lang.wrappper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토 박싱(Auto-Boxing)

        //Wrapper -> Primitive
        int unboxValue = boxedValue; // 오토 언박생(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxValue = " + unboxValue);
    }
}
