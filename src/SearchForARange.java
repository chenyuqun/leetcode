/**
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n)
 *If the target is not found in the array, return [-1, -1].
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4].
 */
public class SearchForARange {
    public static int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        result[0]=findFirst(nums,target);
        result[1]=findLast(nums,target);
        return result;
    }

    private static int findFirst(int[] nums, int target){
        int id=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)>>1;
            if(nums[mid]<target){
                i=mid+1;
            }else{
                j=mid-1;
            }
            if(nums[mid]==target)
                id=mid;
        }
        return id;
    }

    private static int findLast(int[] nums, int target){
        int id=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int mid=(i+j)>>1;
            if(nums[mid]<=target){
                i=mid+1;
            }else{
                j=mid-1;
            }
            if(nums[mid]==target)
                id=mid;
        }
        return id;
    }


    public static void main(String[] args){
        int[] nums={0,1,2,3,4,4,4};
        int target=2;
        System.out.println(searchRange(nums,target));

    }
}
