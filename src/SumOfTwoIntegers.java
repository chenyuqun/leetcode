/**No.371
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 * Example:
 * Given a = 1 and b = 2, return 3.
 */

/**
 * 熟练使用 & ^ ~ <<等二进制操作
 */
public class SumOfTwoIntegers {
    public static int getSum(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;

        while (b != 0) {
            //计算不带近位的和
            int carry = a & b;
            //计算进位
            a = a ^ b;
            //进位左移一位
            b = carry << 1;
        }

        return a;
    }

    public static void main(String[] args){
        System.out.println(getSum(11,3));
    }
}
