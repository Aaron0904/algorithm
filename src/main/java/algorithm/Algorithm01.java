package algorithm;

/**
 * @Author: aaron
 * @Date: 3/21/21 12:14 AM
 */
public class Algorithm01 {

    public static int[] generateArray(int n) {
        if (n <= 0) throw new RuntimeException("n must be positive!");
        if (n == 1) return new int[]{1};

        int[] result = new int[n];
        int half = (n + 1) >> 1;
        int[] pre = generateArray(half);
        int index = 0;

        while (index < half) {
            result[index] = pre[index] * 2 - 1;
            index++;
        }

        while (index < n) {
            result[index] = pre[index - half] * 2;
            index++;
        }

        return result;
    }
}
