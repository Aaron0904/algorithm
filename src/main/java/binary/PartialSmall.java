package binary;

import utils.SortUtils;

import java.util.Arrays;

/**
 * @Author: aaron
 * @Date: 3/21/21 9:50 PM
 */
public class PartialSmall {

    public static int getPartialSmall(int[] array) {
        if (array == null || array.length < 2) return -1;

        if (array[0] < array[1]) return 0;

        if (array[array.length - 1] < array[array.length - 2]) return array.length - 1;

        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (array[mid] < array[mid - 1] && array[mid] < array[mid + 1]){
                return mid;
            } else if (array[mid] > array[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] array = SortUtils.generateRandomArray(20, 20);
        System.out.println(Arrays.toString(array));
        System.out.println(getPartialSmall(array));
    }
}
