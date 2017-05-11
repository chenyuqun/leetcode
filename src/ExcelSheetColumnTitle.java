/**
 * No.168
 * @see ExcelSheetColumnNumber
 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
 * For example:
 * 1 -> A
 * 2 -> B
 * 3 -> C
 * ...
 * 26 -> Z
 * 27 -> AA
 * 28 -> AB
 */
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int n) {
        StringBuilder sb=new StringBuilder();
        while (n>0){
            int remainder=n%26;
            if(remainder==0) remainder=26;
            sb.append((char)(remainder+'A'-1));
            n=(n-remainder)/26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(convertToTitle(27));
    }
}
