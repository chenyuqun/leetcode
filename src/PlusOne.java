import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * No.66
 * Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 * You may assume the integer do not contain any leading zero, except the number 0 itself.
 * The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        List<Integer> list=new ArrayList<>();
        int carry=0;
        for (int i = digits.length-1; i >=0 ; i--) {
            if(i==digits.length-1){
                if(digits[i]+1>=10){
                    list.add(digits[i]-9);
                    if(i==0){
                        list.add(1);
                    }
                    carry=1;
                }else{
                    list.add(digits[i]+1);
                    carry=0;
                }
            }else{
                if(digits[i]+carry>=10){
                    list.add(digits[i]+carry-10);
                    if(i==0){
                        list.add(1);
                    }
                    carry=1;
                }else{
                    list.add(digits[i]+carry);
                    carry=0;
                }

            }
        }
        Collections.reverse(list);
        int[] result=new int[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            result[i]=list.get(i);
        }
        return result;
    }

    public static void main(String[] args){
        int[] digits={1,1,1};
        Arrays.asList(plusOne(digits)).stream().forEach(System.out::println);
    }

}
