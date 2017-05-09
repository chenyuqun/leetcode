import java.util.HashMap;
import java.util.Map;

/**
 * No.383
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false
 *
 * Each letter in the magazine string can only be used once in your ransom note.
 *
 * Note:
 * You may assume that both strings contain only lowercase letters.
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 */
public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<String,Integer> map1=getCountMap(ransomNote);
        Map<String,Integer> map2=getCountMap(magazine);
        for(String s:map1.keySet()){
            if(!map2.containsKey(s)){
                return false;
            }else if(map1.get(s)>map2.get(s)){
                return false;
            }
        }
        return true;
    }

    public static Map getCountMap(String s){
        Map<String,Integer> map=new HashMap();
        for (int i = 0; i <s.length() ; i++) {
            String key=String.valueOf(s.charAt(i));
            if(!map.containsKey(key)){
                map.put(key,1);
            }else{
                map.put(key,map.get(key)+1);
            }
        }
        return map;
    }

    /**
     * 这个答案更加优雅 因为实际上key的数量是固定的
     * @param ransomNote
     * @param magazine
     * @return
     */
    public boolean answer(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            arr[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if(--arr[ransomNote.charAt(i)-'a'] < 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args){
        System.out.println(canConstruct("aac","aab"));
    }
}
