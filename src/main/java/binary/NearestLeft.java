package binary;

import org.apache.commons.collections.CollectionUtils;
import utils.SortUtils;

/**
 * @Author: aaron
 * @Date: 3/21/21 12:58 AM
 */
public class NearestLeft {

    public static int getNearestLeft(int[] array, int number) {
        if (array == null || array.length < 1) return -1;

        int left = 0;
        int right = array.length - 1;
        int index = -1;

        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (array[mid] == number) {
                index = mid;
                right = mid - 1;
            } else if (array[mid] > number) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 1, 1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 7, 7};
        System.out.println(getNearestLeft(array, 0));
    }
}
