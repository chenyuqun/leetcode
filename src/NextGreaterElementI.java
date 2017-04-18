import java.util.ArrayList;
import java.util.List;

/**
 * You are given two arrays (without duplicates) nums1 and nums2 where nums1’s elements are subset of nums2.
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2.
 * If it does not exist, output -1 for this number.
 */
public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        int[] result=new int[findNums.length];
        for (int i = 0; i <findNums.length ; i++) {

            int addNum=-1;
            int order=0;
            for(int j=0;j<nums.length;j++){
                if(findNums[i]==nums[j]){
                    order=j;
                    break;
                }
            }
            for (int j = order; j <nums.length ; j++) {
                if(nums[j]>findNums[i]){
                    addNum=nums[j];
                    break;
                }
            }
           result[i]=addNum;
        }

        return result;
    }

    public static void main(String[] args){
        int[] findNums={4,1,2};
        int[] nums={1,3,4,2};
        System.out.println(nextGreaterElement(findNums,nums));
    }
}
