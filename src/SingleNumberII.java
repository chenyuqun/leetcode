/**
 * No.137
 * Given an array of integers, every element appears three times except for one, which appears exactly once. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumberII {
    public static int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for(int i = 0; i < nums.length; i++){
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }
        return ones;
    }

    public static void main(String[] args){
        int[] nums={1,1,3,1,2,2,2};
        System.out.println(singleNumber(nums));
    }
}
