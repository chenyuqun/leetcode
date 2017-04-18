/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
     Example 1:
     Input: "Let's take LeetCode contest"
     Output: "s'teL ekat edoCteeL tsetnoc"
     Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
public class ReverseWordsInAStringIII {
    public static String reverseWords(String s) {
        String[] strings=s.split(" ");
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            StringBuffer sb=new StringBuffer();
            for(int j=strings[i].length()-1;j>=0;j--){
                sb.append(strings[i].charAt(j));

            }
            if(i!=(strings.length-1)){
                stringBuffer.append(sb+" ");
            }else{
                stringBuffer.append(sb);
            }


        }

        return stringBuffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
