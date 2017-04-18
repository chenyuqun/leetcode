/**
 * Created by Administrator on 2017/4/13.
 */
public class ReverseString {
    public static String reverseString(String s) {
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=s.length()-1;i>=0;i--){
            stringBuffer.append(s.charAt(i));
        }
        return stringBuffer.toString();
    }

    public static void main(String[] args){
        System.out.println(reverseString("hello"));
    }
}
