import java.util.ArrayList;
import java.util.List;

/**
 * No.605
 * Suppose you have a long flowerbed in which some of the plots are planted and some are not. However, flowers cannot be planted in adjacent plots - they would compete for water and both would die.
 *
 * Given a flowerbed (represented as an array containing 0 and 1, where 0 means empty and 1 means not empty), and a number n, return if n new flowers can be planted in it without violating the no-adjacent-flowers rule.
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 * Note:
 * The input array won't violate no-adjacent-flowers rule.
 * The input array size is in the range of [1, 20000].
 * n is a non-negative integer which won't exceed the input array size.
 */
public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int result=0;
        List<Integer> list=new ArrayList<>();
        list.add(-2);
        for (int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1)
                list.add(i);
        }
        list.add(flowerbed.length+1);
        for (int i = 0; i <list.size()-1 ; i++) {
            result+=((list.get(i+1)-list.get(i))/2-1)>0?(list.get(i+1)-list.get(i))/2-1:0;
        }

        return result>=n?true:false;
    }

    public static void main(String[] args){
        int[] flowerbed={0,0,1,0,1};
        //System.out.println(canPlaceFlowers(flowerbed,1));
        System.out.println(canPlaceFlowers(flowerbed,1));
    }
}