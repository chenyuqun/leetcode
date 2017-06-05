import java.util.Arrays;

/**
 * No.260
 * Given an array of numbers nums, in which exactly two elements appear only once and all the other elements appear exactly twice. Find the two elements that appear only once.
 * For example:
 * Given nums = [1, 2, 1, 3, 2, 5], return [3, 5].
 * Note:
 * The order of the result is not important. So in the above example, [5, 3] is also correct.
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant space complexity?
 */
public class SingelNumberIII {
    public static int[] singleNumber(int[] nums) {
        int temp=0;
        for (int n:nums) {
            temp ^=n;
        }
        /**
         * There is a little trick here to get a bit equal 1 from the result XOR.
         see if we get XOR = aaaa1000(a = 1 or 0)
         we could get the first(from low to high) bit equals 1 as follow:
         first:~XOR = bbbb0111 (b = ~a)
         then add 1, with carrying bits ~XOR + 1 = bbbb1000
         then, XOR & (~XOR + 1) = 00001000
         so we can write as XOR & (-XOR) also.
         */
        int mask =-temp&temp;
        int result1=0,result2=0;
        for(int n:nums){
            if((n & mask)==0){
                result1 ^=n;
            }else{
                result2 ^=n;
            }
        }

        return new int[]{result1,result2};
    }

    public static void main(String[] args) {
        int[] nums={1,2,1,3,2,5};
        Arrays.asList(singleNumber(nums)).stream().forEach(System.out::println);
    }
}
