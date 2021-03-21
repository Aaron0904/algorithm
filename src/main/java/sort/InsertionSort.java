package sort;

import utils.SortUtils;

/**
 * @Author: aaron
 * @Date: 3/21/21 12:01 AM
 */
public class InsertionSort {

    public static void insertionSort(int[] array) {
        if (array == null || array.length < 2) return;

        for (int i = 1; i < array.length; i++) {
            for (int j = i - 1; j >= 0 && array[j] > array[j + 1]; j++) {
                SortUtils.swap2(array, j, j + 1);
            }
        }
    }
}
