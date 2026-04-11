package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {

    public static void main(String[] args) {

        Random random = new Random();
        int[] numbers = new int[6];
        boolean isExist = false;
        int count = 0;

        while (count < 6){
            int randomNumber = random.nextInt(45) + 1;

            for(int i = 0; i < count; i++){
                if(randomNumber == numbers[i]){
                    isExist = true;
                }
            }
            if(!isExist){
                numbers[count] = randomNumber;
                count++;
            }
            isExist = false;
        }

        System.out.println("numbers = " + Arrays.toString(numbers));
    }
}
