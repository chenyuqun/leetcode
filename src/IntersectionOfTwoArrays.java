import java.util.*;

/**
 * No.349
 * Given two arrays, write a function to compute their intersection.
 * Example:
 * Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].
 * Note:
 * Each element in the result must be unique.
 * The result can be in any order.
 * Subscribe to see which companies asked this question.
 */
public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1=new HashSet();
        Set<Integer> set2=new HashSet();
        for (int i = 0; i <nums1.length ; i++) {
           set1.add(nums1[i]);
        }
        for (int i = 0; i <nums2.length ; i++) {
            if(set1.contains(nums2[i]))
                set2.add(nums2[i]);
        }
        List<Integer> resultList=new ArrayList<>();
        for (Integer i:
             set2) {
            resultList.add(i);
        }
        int[] result=new int[resultList.size()];
        for(int i=0;i<result.length;i++){
            result[i]=resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums1={1,3,5,7,9};
        int[] nums2={2,3,4,7};
        Arrays.asList(intersection(nums1,nums2)).forEach(System.out::println);
    }
}
