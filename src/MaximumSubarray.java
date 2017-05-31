/**
 * No.53
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * For example, given the array [-2,1,-3,4,-1,2,1,-5,4],
 * the contiguous subarray [4,-1,2,1] has the largest sum = 6.
 *
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0)
                sum = nums[i];
            else
                sum += nums[i];
            if (sum > max)
                max = sum;
        }
        return max;
    }

    /**
     * 这个答案超时，有点莫名
     * @param nums
     * @return
     */
    public static int maxSubArray2(int[] nums) {
        int sum=nums[0];
        int max=nums[0];
        for (int i = 1; i <nums.length ; i++) {
            if(sum<0)
                sum=0;
            sum+=nums[i];
            max=Math.max(sum,max);
        }
        return max;
    }

    public static void main(String[] args){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
