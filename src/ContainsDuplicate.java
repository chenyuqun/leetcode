import java.util.HashSet;
import java.util.Set;

/**
 * No 217
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set set=new HashSet();
        for (int i = 0; i <nums.length ; i++) {
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums={0};
        System.out.println(containsDuplicate(nums));
    }
}
