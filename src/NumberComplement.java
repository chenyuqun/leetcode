/**
 * Created by Administrator on 2017/4/13.
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

 Note:
 The given integer is guaranteed to fit within the range of a 32-bit signed integer.
 You could assume no leading zero bit in the integer’s binary representation.
 Example 1:
 Input: 5
 Output: 2
 Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.
 */
public class NumberComplement {
    public static int findComplement(int num) {
        String binaryString=Integer.toBinaryString(num);
        StringBuffer stringBuffer=new StringBuffer();
        Boolean flag=false;
        for (int i = 0; i <binaryString.length() ; i++) {
            if(binaryString.charAt(i)=='0'){
                flag=true;
                if(flag)
                    stringBuffer.append('1');
            }else{
                    stringBuffer.append('0');
            }

        }

        return Integer.valueOf(stringBuffer.toString(),2);

    }

    public static void main(String[] args){
        System.out.println(findComplement(5));
    }
}
