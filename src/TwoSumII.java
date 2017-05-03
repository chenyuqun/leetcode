import java.util.Arrays;

/**
 * No.167
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class TwoSumII {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result=new int[2];
        int i=0;int j=numbers.length-1;
        while(i<j){
            if (numbers[i]+numbers[j]==target){
                result[0]=i+1;
                result[1]=j+1;
                return result;
            }else if(numbers[i]+numbers[j]<target){
                i++;
            }else{
                j--;
            }
        }
        return result;

    }

    public static void main(String[] args){
        int[] numbers={2,7,11,15};
        int target=9;
        Arrays.asList(twoSum(numbers,target)).forEach(System.out::println);
    }
}
