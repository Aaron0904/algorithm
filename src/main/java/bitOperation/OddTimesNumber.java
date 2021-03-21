package bitOperation;

import java.util.Arrays;

/**
 * @Author: aaron
 * @Date: 3/21/21 10:15 PM
 */
public class OddTimesNumber {

    public static int getOddTimesNumber(int[] array) {
        return Arrays.stream(array).reduce(0, (a1, b) -> a1 ^ b);
    }

    public static void main(String[] args) {
        int[] array = new int[]{2,1,2,1,3,3,3,4,2,2,1,1,4};
        System.out.println(getOddTimesNumber(array));
    }
}
