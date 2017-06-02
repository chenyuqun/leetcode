/**
 * No.459
 * Given a non-empty string check if it can be constructed by taking a substring of it and appending multiple copies of the substring together. You may assume the given string consists of lowercase English letters only and its length will not exceed 10000.
 *
 * Example 1:
 * Input: "abab"
 *
 * Output: True
 *
 * Explanation: It's the substring "ab" twice.
 * Example 2:
 * Input: "aba"
 *
 * Output: False
 * Example 3:
 * Input: "abcabcabcabc"
 *
 * Output: True
 *
 * Explanation: It's the substring "abc" four times. (And the substring "abcabc" twice.)
 */
public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int length=s.length();
        for (int i = 0; i <length/2 ; i++) {
            if(length%(i+1)!=0){
                continue;
            }else{
                int times=length/(i+1);
                String newS=s.substring(0,i+1);
                while (times>1){
                    if(!newS.equals(s.substring((times-1)*(i+1),(i+1)*times)))
                        break;
                    times--;
                }
                if(times==1){
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args){
        //System.out.println("aaaa".substring(0,4));
        System.out.println(repeatedSubstringPattern("ab"));
    }
}
