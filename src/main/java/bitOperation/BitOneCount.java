package bitOperation;

/**
 * @Author: aaron
 * @Date: 3/21/21 10:59 PM
 */
public class BitOneCount {

    public static int getBitOneCount(int n) {
        int count = 0;
        while (n != 0) {
            int i = RightOne.getRightOne(n);
            count++;
            n = n ^ i;
        }
        return count;
    }


    public static void main(String[] args) {
        int n = 443;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(getBitOneCount(n));
    }
}
