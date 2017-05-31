import java.util.*;

/**
 * No.350
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].
 *
 * Note:
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 */
public class IntersectionOfTwoArraysII {
    private static List<Integer> resultList=new ArrayList<>();

    public static int[] intersect(int[] nums1, int[] nums2) {
        if(nums1.length<nums2.length){
            int[] temp=nums2;
            nums2=nums1;
            nums1=temp;
        }
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();
        for (int i: nums1) {
            list1.add(i);
        }
        for (int i: nums2) {
            list2.add(i);
        }
        for (int i:nums2) {
            remove(list1,i);
        }
        int[] result=new int[resultList.size()];
        for (int i = 0; i <resultList.size() ; i++) {
            result[i]=resultList.get(i);
        }
        return result;


    }

    public static List<Integer> remove(List<Integer> list,int num){
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            int i=iterator.next();
            if(i==num){
                resultList.add(i);
                iterator.remove();
                break;
            }
        }
        return list;

    }
    public static void main(String[] args){
        /**
         * [-2147483648,1,2,3]
         [1,-2147483648,-2147483648]
         */
        int[] nums1={-2147483648,1,2,3};
        int[] nums2={1,-2147483648,-2147483648};
        Arrays.asList(intersect(nums1,nums2)).stream().forEach(System.out::println);
        int i=-2147483648;
        int j=-2147483648;
        System.out.println(i==j);
    }
}
