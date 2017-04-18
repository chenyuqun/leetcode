/**
 * Given an array of integers, every element appears twice except for one. Find that single one.
 Note:
 Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class SingleNumber {
    public static int singleNumber(int[] nums) {
            int result=0;
            for (int i:nums){
                result ^= i;
            }
            return result;
    }

    public static void main(String[] args){
        int[] nums={1,2,3,3,2,1,4,5,5};
        System.out.println(singleNumber(nums));
    }
}
