/**
 * No.434
 * Count the number of segments in a string, where a segment is defined to be a contiguous sequence of non-space characters.
 * Please note that the string does not contain any non-printable characters.
 * Example:
 *
 * Input: "Hello, my name is John"
 * Output: 5
 */
public class NumberOfSegmentsInAString {
    public static int countSegement(String s){
        int result=0;
        String[] strings=s.split(" ");
        for (String string:strings){
            if(!string.equals(""))
                result++;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(countSegement("Hello, my name is John"));
    }
}
