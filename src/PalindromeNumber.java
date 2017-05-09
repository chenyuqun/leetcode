/**
 * No.9
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        String s=String.valueOf(x);
        int length=s.length();
        for(int i=0;i<length/2+1;i++){
            if(s.charAt(i)!=s.charAt(length-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(isPalindrome(13415431));
    }
}
