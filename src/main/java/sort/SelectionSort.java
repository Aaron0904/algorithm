package sort;

import utils.SortUtils;

/**
 * @Author: aaron
 * @Date: 3/21/21 12:02 AM
 */
public class SelectionSort {

    public static void selectionSort(int[] array) {
        if (array == null || array.length < 2) return;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                minIndex = array[j] < array[minIndex] ? j : minIndex;
            }
            SortUtils.swap(array, i, minIndex);
        }
    }

    public static void main(String[] args) {

    }
}
