/**
 * No.70
 * You are climbing a stair case. It takes n steps to reach to the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Note: Given n will be a positive integer.
 */
public class ClimbingStairs {
    public static int climbStairs(int n) {

        int[] nums=new int[n+1];
        if(n==1||n==2||n==0){
            return n;
        }else{
            nums[1]=1;nums[2]=2;
            for(int i=3;i<=n;i++){
                nums[i]=nums[i-1]+nums[i-2];
            }
            return nums[n];
        }

    }

    public static void main(String[] args){
        System.out.println(climbStairs(10));
    }
}
