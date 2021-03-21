package bitOperation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: aaron
 * @Date: 3/21/21 10:51 PM
 */
public class TwoOddTimesNumbers {

    public static int[] getTwoOddTimesNumbers(int[] array) {
        int n = Arrays.stream(array).reduce(0, (a, b) -> a ^ b);
        int one = RightOne.getRightOne(n);
        List<Integer> list = new ArrayList<>();
        Arrays.stream(array).filter(a -> (a & one) == 0).forEach(list::add);
        int[] result = new int[2];
        result[0] = list.stream().reduce(0, (a, b) -> a ^ b);
        result[1] = n ^ result[0];
        return result;
    }

    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 2, 3, 4, 5, 6, 3};
        int[] r = getTwoOddTimesNumbers(array);
        System.out.println(Arrays.toString(r));
    }
}
