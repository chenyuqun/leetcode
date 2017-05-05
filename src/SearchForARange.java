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
        int i=0;
        int j=nums.length-1;
        int[] result=new int[2];
        if(nums.length==0||nums[i]>target||nums[j]<target){
            result[0]=-1;
            result[1]=-1;
            return result;
        }
        while (j!=0){
            if(nums[j]==target) {
                break;
            }else if(nums[j]<target){
                j=(nums.length-1+j)/2;
            }else{
                j=j/2;
            }
        }
        int k=j;int m=j;
        while(nums[k]==nums[j]){
            if(k==0){
                result[0]=0;
                break;
            }else{
                k--;
            }
        }
        result[0]=k;
        while(nums[m]==nums[j]){
            if(m==nums.length-1){
                result[1]=nums.length-1;
                break;
            }else{
                m++;
            }
        }
        result[1]=m;
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,1};
        int target=1;
        System.out.println(searchRange(nums,target));

    }
}
