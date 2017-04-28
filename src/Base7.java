/**
 * Given an integer, return its base 7 string representation.
 */
public class Base7 {
    public static String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        StringBuilder symbol=new StringBuilder();
        if(num<0){
            symbol.append("-");
            num =-num;
        }
        StringBuilder number=new StringBuilder();
        while(num!=0){
            //余数
            int remainder=num%7;
            number.append(remainder);
            //剩余
            num=(num-remainder)/7;
        }
        return (symbol.append(number.reverse())).toString();
    }

    public static void main(String[] args){
        System.out.println(convertToBase7(-100));
    }
}
