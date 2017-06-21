/**
 * No.537
 * Given two strings representing two complex numbers.
 *
 * You need to return a string representing their multiplication. Note i2 = -1 according to the definition.
 * Example 1:
 * Input: "1+1i", "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 * Example 2:
 * Input: "1+-1i", "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 * Note:
 *{

 }
 * The input strings will not have extra blank.
 * The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.
 */
public class ComplexNumberMultiplication {
    public static String complexNumberMultiply(String a, String b) {
        String as[]=a.split("\\+");
        String bs[]=b.split("\\+");
        int c=Integer.valueOf(as[0]);
        int d=Integer.valueOf(as[1].substring(0,as[1].length()-1));
        int e=Integer.valueOf(bs[0]);
        int f=Integer.valueOf(bs[1].substring(0,bs[1].length()-1));
        StringBuilder sb=new StringBuilder();
        int g=c*e-d*f;
        int h=c*f+d*e;
        sb.append(g).append("+").append(h).append("i");
        return sb.toString();

    }

    public static void main(String[] args){
        System.out.println(complexNumberMultiply("1+1i","1+1i"));
        System.out.println(complexNumberMultiply("1+-1i","1+-1i"));
    }
}
