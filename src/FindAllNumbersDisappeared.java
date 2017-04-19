import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** No 448
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

 Find all the elements of [1, n] inclusive that do not appear in this array.

 Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 */
public class FindAllNumbersDisappeared {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++) {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0) {
                nums[val] = -nums[val];
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,5,3,6,7,8,7,7,9};
        System.out.println(findDisappearedNumbers(nums));
    }
}
