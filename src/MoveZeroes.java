/**
 * No 283
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * Note:
 * 1.You must do this in-place without making a copy of the array.
 * 2.Minimize the total number of operations.
 */
public class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==0){
                for (int j = i+1; j <nums.length ; j++) {
                    if(nums[j]!=0){
                        int tmp=nums[j];
                        nums[j]=nums[i];
                        nums[i]=tmp;
                        break;
                    }
                }
            }
        }

        return nums;
    }

    public static void main(String[] args){
        int[] nums={0,1,2,13,0,4};
        System.out.println(moveZeroes(nums));
    }
}
