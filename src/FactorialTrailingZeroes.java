/**
 * No.172
 * Given an integer n, return the number of trailing zeroes in n!.
 *
 * Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeroes {
    public static int trailingZeroes(int n) {
        int result=0;
        while(n>=5){
            result+=n/5;
            n=n/5;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(trailingZeroes(25));
    }
}
