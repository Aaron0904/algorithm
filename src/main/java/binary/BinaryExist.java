package binary;

import utils.SortUtils;

import java.util.Arrays;

/**
 * @Author: aaron
 * @Date: 3/21/21 12:45 AM
 */
public class BinaryExist {

    private static int exist(int[] array, int number) {
        if (array == null || array.length == 0) return -1;

        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (array[mid] == number) {
                return mid;
            } else if (array[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return array[left] == number ? left : -1;
    }

    public static void main(String[] args) {
//        int[] array = SortUtils.generateRandomArray(20, 5);
        int[] array = new int[]{7, 1, 8, -3, 2};
        System.out.println(Arrays.toString(array));
        int number = array[array.length >> 1];
        System.out.println(number);
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(exist(array, number));
    }
}
