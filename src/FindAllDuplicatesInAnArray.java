import java.util.ArrayList;
import java.util.List;

/**
 * No.442
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 *
 * Could you do it without extra space and in O(n) runtime?
 *
 * Example:
 * Input:
 * [4,3,2,7,8,2,3,1]
 *
 * Output:
 * [2,3]
 */
public class FindAllDuplicatesInAnArray {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int[] num=new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            num[nums[i]-1]++;
        }
        for (int i = 0; i <num.length ; i++) {
            if(num[i]==2){
                result.add(i+1);
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={4,3,2,7,8,2,3,1};
        findDuplicates(nums).stream().forEach(System.out::println);
    }

}
