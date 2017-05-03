import java.util.*;

/**
 * No.506
 * Given scores of N athletes, find their relative ranks and the people with the top three highest scores,
 * who will be awarded medals: "Gold Medal", "Silver Medal" and "Bronze Medal".
 *
 * Examples:
 * Input: [5, 4, 3, 2, 1]
 * Output: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * Explanation: The first three athletes got the top three highest scores, so they got "Gold Medal", "Silver Medal" and "Bronze Medal".
 * For the left two athletes, you just need to output their relative ranks according to their scores.
 */
public class RelativeRanks {
    public static String[] findRelativeRanks1(int[] nums) {
        int[][] pair = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        //重写排序方法
        Arrays.sort(pair, (a, b) -> (b[0] - a[0]));

        String[] result = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                result[pair[i][1]] = "Gold Medal";
            }
            else if (i == 1) {
                result[pair[i][1]] = "Silver Medal";
            }
            else if (i == 2) {
                result[pair[i][1]] = "Bronze Medal";
            }
            else {
                result[pair[i][1]] = (i + 1) + "";
            }
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums={10,3,8,9,4};
        Arrays.asList(findRelativeRanks1(nums)).forEach(System.out::println);
    }
}
