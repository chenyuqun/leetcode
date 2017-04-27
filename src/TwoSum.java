/**
 *   No 1
 *   Given nums = [2, 7, 11, 15], target = 9,
 *   Because nums[0] + nums[1] = 2 + 7 = 9,
 *   return [0, 1].
 */
public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result=null;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length  ; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result = new int[]{i, j};
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={2,11,7,15};
        int target=26;
        System.out.println(twoSum(nums,target));
    }
}
