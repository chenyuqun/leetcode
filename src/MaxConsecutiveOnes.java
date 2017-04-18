import java.util.ArrayList;
import java.util.List;

/**
 * Given a binary array, find the maximum number of consecutive 1s in this array.
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int j=0;
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if(i==nums.length-1&&nums[i]==1){
                j++;
                list.add(j);
            }else if(nums[i]==0){
                list.add(j);
                j=0;
            }else if(nums[i]==1) {
                j++;

            }
        }
        int result=0;
        for (Integer integer : list) {
            if(integer>result){
                result=integer;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={0,1,1,1,0,0,1,1,0,1,1,1,1,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
