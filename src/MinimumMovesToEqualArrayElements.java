/**
 * No.453
 * Given a non-empty integer array of size n, find the minimum number of moves required to make all array elements equal,
 * where a move is incrementing n - 1 elements by 1.
 * Example:
 * Input:
 * [1,2,3]
 * Output:
 * 3
 * Explanation:
 * Only three moves are needed (remember each move increments two elements):
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 */
public class MinimumMovesToEqualArrayElements {
    public static int minMoves(int[] nums) {
        //其他数加一和最大值减一步骤等效
        int min=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        int result=0;
        for (int i = 0; i <nums.length ; i++){
            result +=nums[i]-min;
        }
        return result;
    }

    public static void main(String[] args){
        int[] nums={1,2,3};
        System.out.println(minMoves(nums));
    }
}
