/**
 * No 5
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.
 */
public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        if("".equals(s)){
            return "";
        }
        if(s.length()==1){
            return s;
        }
        //从最长开始
        for (int i = 0; i <s.length() ; i++) {
            //检验是否存在回文字符串
            for (int j = 0; j <=i ; j++) {
                //判断是否是回文
                Boolean flag=true;
                for (int k = 0; k <s.length()-i ; k++) {
                    if(flag){
                        if(s.charAt(j+k)!=s.charAt(s.length()-i+j-k-1)){
                            flag=false;
                            break;
                        }
                        flag=true;
                    }

                }
                if(flag)
                return s.substring(j,s.length()-i+j);
            }
        }

        return "";
    }

    public static void main(String[] args){
        System.out.println(longestPalindrome("abcbcbc"));
    }
}
