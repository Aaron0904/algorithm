package sort;

import algorithm.Algorithm01;
import utils.SortUtils;

import java.util.Arrays;

/**
 * @Author: aaron
 * @Date: 3/21/21 12:01 AM
 */
public class BubbleSort {

    public static void bubbleSort(int[] array) {
        if (array == null || array.length < 2) return;

        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    SortUtils.swap2(array, j, j+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = Algorithm01.generateArray(20);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}
