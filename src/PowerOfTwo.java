/**
 * Given an integer, write a function to determine if it is a power of two.
 */
public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if(n==1) return true;
        while(n>1){
            if(n%2==0){
                n=n/2;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPowerOfTwo(17));
    }
}
