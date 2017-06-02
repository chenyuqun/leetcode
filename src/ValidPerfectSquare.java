/**
 * No.367
 * Given a positive integer num, write a function which returns True if num is a perfect square else False.
 *
 * Note: Do not use any built-in library function such as sqrt.
 *
 * Example 1:
 *
 * Input: 16
 * Returns: True
 * Example 2:
 *
 * Input: 14
 * Returns: False
 */
public class ValidPerfectSquare {
    public static boolean isPerfectSquare(int num) {
        int low=1,high=num;
        while(low<=high){
            //防止越界
            long mid=(low+high)/2;
            if(mid*mid==num){
                return true;
            }else if(mid*mid<num){
                low=(int)mid+1;
            }else{
                high=(int)mid-1;
            }
        }
        return false;
    }

    public static void main(String[] args){
        System.out.println(isPerfectSquare(16));
    }
}
