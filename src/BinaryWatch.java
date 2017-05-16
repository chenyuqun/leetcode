import java.util.ArrayList;
import java.util.List;

/**
 * No.401
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59).
 * Each LED represents a zero or one, with the least significant bit on the right.
 * @see <a href="图片">https://upload.wikimedia.org/wikipedia/commons/8/8b/Binary_clock_samui_moon.jpg</a>
 * For example, the above binary watch reads "3:25".
 * Given a non-negative integer n which represents the number of LEDs that are currently on, return all possible times the watch could represent.
 * Example:
 * Input: n = 1
 * Return: ["1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32"]
 * Note:
 * The order of output does not matter.
 * The hour must not contain a leading zero, for example "01:00" is not valid, it should be "1:00".
 * The minute must be consist of two digits and may contain a leading zero, for example "10:2" is not valid, it should be "10:02".
 */
public class BinaryWatch {
    public static List<String> readBinaryWatch(int num) {
        List<String> result=new ArrayList<>();
        int first[]={8,4,2,1};int second[]={32,16,8,4,2,1};
        //i代表第一行亮灯数
        for(int i=0;i<=num;i++){
            if(i>4||num-i>6){
                continue;
            }else{
                List<Integer> list1=combinationSum(first,i);
                List<Integer> list2=combinationSum(second,num-i);
                for (Integer j:list1) {
                    if(j>=12) continue;
                    for(Integer k:list2){
                        if(k>=60) continue;
                        result.add(j+":"+(k<10?"0":"")+k);
                    }
                }
            }

        }
        return result;

    }

    /**
     * 获取数字排列组合的和
     * @param dataList
     * @param n
     * @return
     */
    private static List<Integer> combinationSum(int[] dataList, int n) {
        List<Integer> res = new ArrayList<>();
        combinationSumHelper(dataList, n, 0, 0, res);
        return res;
    }

    /**
     * 递归获取详细组合
     * @param nums
     * @param count
     * @param pos
     * @param sum
     * @param res
     */
    private static void combinationSumHelper(int[] nums, int count, int pos, int sum, List<Integer> res) {
        if(count == 0) {
            res.add(sum);
            return;
        }

        for(int i = pos; i < nums.length; i++) {
            combinationSumHelper(nums, count - 1, i + 1, sum + nums[i], res);
        }
    }


    public static void main(String[] args){
        int num=1;
        readBinaryWatch(num).stream().forEach(System.out::println);
    }
}
