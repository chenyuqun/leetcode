/**
 * No.125
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 *
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 *
 * For the purpose of this problem, we define empty string as valid palindrome.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;int j=s.length()-1;
        while(i<=j){
            if(!(s.charAt(i)-'a'>=0&&s.charAt(i)-'z'<=0)&&
                    !(s.charAt(i)-'0'>=0&&s.charAt(i)-'9'<=0)){
                i++;
                continue;
            }
            if(!(s.charAt(j)-'a'>=0&&s.charAt(j)-'z'<=0)&&
                    !(s.charAt(j)-'0'>=0&&s.charAt(j)-'9'<=0)){
                j--;
                continue;
            }
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;j--;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
    }
}
