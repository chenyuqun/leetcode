/**
 * No.387
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1
 * Examples:
 * s = "leetcode"
 * return 0.
 * s = "loveleetcode",
 * return 2.
 * Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacterInAString {
    public static int firstUniqChar(String s) {
        int result=-1;
        int[] chars=new int[26];
        for (int i = 0; i <s.length() ; i++) {
            if(chars[s.charAt(i)-'a']==0){
                chars[s.charAt(i)-'a']=i+1;
            }else if(chars[s.charAt(i)-'a']>0){
                chars[s.charAt(i)-'a']=-1;
            }
        }
        Boolean first=true;
        for(int i:chars){
            if(i>0){
                if(first){
                    result=i-1;
                    first=false;
                }else{
                    result=Math.min(result,i-1);
                }

            }

        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(firstUniqChar("lzxcvbnmasdfglhzx"));
    }
}
