import java.util.*;

/**
 * No.532
 * Given an array of integers and an integer k, you need to find the number of unique k-diff pairs in the array.
 * Here a k-diff pair is defined as an integer pair (i, j),
 * where i and j are both numbers in the array and their absolute difference is k.
 */
public class KdiffPairsInAnArray {
    public static int findPairs(int[] nums, int k) {
        int result=0;
        if(k>0){
            Set set=new HashSet();
            for (int i:nums) {
                set.add(i);
            }
            Iterator<Integer> iterator=set.iterator();
            while (iterator.hasNext()){
                if(set.contains(iterator.next()+k))
                    result++;
            }
        }else if(k==0){
            //统计大于2次的元素个数
            Map<Integer,Integer> map=new HashMap();
            for (int i:nums) {
                if(map.containsKey(i)){
                    map.put(i,map.get(i)+1);
                }else{
                    map.put(i,1);
                }
            }
            Iterator<Integer> iterator=map.values().iterator();
            while (iterator.hasNext()){
                if(iterator.next()>=2){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,3,1,5,4};
        int k=0;
        System.out.println(findPairs(nums,k));
    }
}
