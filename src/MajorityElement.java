/**
 * No.169
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int major=nums[0];
        int num=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==major){
                num++;
            }else{
                num--;
            }
            if(num<0){
                major=nums[i];
                num=-num;
            }
        }
        return major;
    }

    public static void main(String[] args){
        int[] nums={10,9,9,9,10};
        System.out.println(majorityElement(nums));
    }
}
