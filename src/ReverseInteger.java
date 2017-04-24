/**No.7
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 *   Example2: x = -123, return -321
 * Note:
 *   The input is assumed to be a 32-bit signed integer.
 *   Your function should return 0 when the reversed integer overflows.
 */
public class ReverseInteger {
    public static int reverse(int x) {
        String s=String.valueOf(x);
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(0)=='-'){
                if(i==0){
                    sb.append('-');
                }else{
                    sb.append(s.charAt(s.length()-i));
                }

            } else{
                sb.append(s.charAt(s.length()-1-i));
            }

        }
        int result=0;
        try{
            result=Integer.valueOf(sb.toString());
        }catch (Exception e){

        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(reverse(-123));
    }
}
