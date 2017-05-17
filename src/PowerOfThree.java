/**
 * No.326
 * Given an integer, write a function to determine if it is a power of three.
 * Follow up:
 * Could you do it without using any loop / recursion?
 */
public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }

    public static void main(String[] args){
        System.out.println(isPowerOfThree(81));
    }
}
