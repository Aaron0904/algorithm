package bitOperation;

/**
 * @Author: aaron
 * @Date: 3/21/21 12:02 AM
 */
public class RightOne {

    public static int getRightOne(int n) {
        return n & ((~n) + 1);
    }

    public static void main(String[] args) {
        int n = 233;
        System.out.println(Integer.toBinaryString(n));
        int m = getRightOne(n);
        System.out.println(Integer.toBinaryString(m));
    }
}
