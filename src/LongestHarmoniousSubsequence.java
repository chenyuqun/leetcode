import java.util.HashMap;
import java.util.Map;
/**
 * No.594
 * We define a harmonious array is an array where the difference between its maximum value and its minimum value is exactly 1.
 *
 * Now, given an integer array, you need to find the length of its longest harmonious subsequence among all its possible subsequences.
 *
 * Example 1:
 * Input: [1,3,2,2,5,2,3,7]
 * Output: 5
 * Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 * Note: The length of the input array will not exceed 20,000.
 */
public class LongestHarmoniousSubsequence {
    public static int findLHS(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int result=0;
        //注意是'minimum value is exactly 1'
        for(int i:map.keySet()){
            int num1=map.getOrDefault(i,0);
            int num2=map.getOrDefault(i-1,0);
            int num3=map.getOrDefault(i+1,0);
            if((num2+num3)!=0){
                result=Math.max(result,Math.max(num1+num2,num1+num3));
            }

        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }
}
