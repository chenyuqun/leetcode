/**
 * No.242
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 *
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class ValidAnagram {
    /**
     * 先开始考虑求和 发现条件不充分{ac,bb}
     * 后来想着能用^为0处理 发现条件不充分{aa,bb}
     * @param s
     * @param t
     * @return
     */
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        int[] nums=new int[26];
        for(int i=0;i<s.length();i++){
            nums[s.charAt(i)-'a']++;
            nums[t.charAt(i)-'a']--;
        }
        for (int i:nums) {
            if(i!=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(isAnagram("aas","acd"));
    }
}
