import java.util.HashSet;
import java.util.Set;

/**
 * Given a string, find the length of the longest substring without repeating characters.

     Examples:

     Given "abcabcbb", the answer is "abc", which the length is 3.

     Given "bbbbb", the answer is "b", with the length of 1.

     Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int result=0;
        for (int i = 0; i <s.length() ; i++) {
            Set<Character> hashSet=new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                hashSet.add(s.charAt(j));
                if(hashSet.size()==(j-i))
                    break;
            }
            if(hashSet.size()>result){
                result=hashSet.size();
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
