/**
 * No.415
 * Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2.
 * Note:
 * The length of both num1 and num2 is < 5100.
 * Both num1 and num2 contains only digits 0-9.
 * Both num1 and num2 does not contain any leading zero.
 * You must not use any built-in BigInteger library or convert the inputs to integer directly.
 */
public class AddStrings {
    public static String addStrings(String num1, String num2) {
            StringBuilder sb1=new StringBuilder(num1);
            StringBuilder sb2=new StringBuilder(num2);
            sb1.reverse();
            sb2.reverse();
            StringBuilder sb=new StringBuilder();
            if(sb1.length()<sb2.length()){
                StringBuilder tmp=sb1;
                sb1=sb2;
                sb2=tmp;
            }
            int max=sb1.length();int min=sb2.length();
            int carry=0;
            for(int i=0;i<max;i++){

                int sum=0;
                if(i<=min-1){
                    sum=carry+sb1.charAt(i)-'0'+sb2.charAt(i)-'0';
                }else{
                    sum=carry+sb1.charAt(i)-'0';
                }
                if(sum>=10){
                    sum=sum-10;carry=1;
                }else {
                    carry=0;
                }

                sb.append(String.valueOf(sum));
                if(i==max-1&&carry==1)
                    sb.append("1");
            }
            return sb.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(addStrings("12345","4321"));
    }
}
