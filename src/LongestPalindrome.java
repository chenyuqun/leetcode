import java.util.HashSet;
import java.util.Set;

/**
 * No.409
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
 * This is case sensitive, for example "Aa" is not considered a palindrome here.
 * Note:
 * Assume the length of given string will not exceed 1,010.
 * Example:
 * Input:
 * "abccccdd"
 *
 * Output:7
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 */
public class LongestPalindrome {
    public static int longestPalindrome(String s) {
       char[] alphabet={'a','b','c','d','e','f','g','h','i','j','k',
       'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A',
       'B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q',
       'R','S','T','U','V','W','X','Y','Z'};
        Set chars=new HashSet();
        for (char c:alphabet) {
            chars.add(c);
        }
       int odd=0;
       int even=0;
       for(char c:alphabet){
           int count=0;
           for (int i = 0; i <s.length() ; i++) {
               if(c==(s.charAt(i)))
                   count++;
           }
           if (count % 2 == 0) {
               even+=count;
           }else{
               odd++;
               if(count>2)
               even+=count-1;
           }
       }
       if(odd>0)
           odd=1;
       return even+odd;
    }

    public static void main(String[] args){
        System.out.println(longestPalindrome("ababababa"));
    }
}
