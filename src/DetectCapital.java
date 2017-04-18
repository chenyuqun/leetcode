/**
 * Created by Administrator on 2017/4/18.
 */
public class DetectCapital {
    public static boolean detectCapitalUse(String word) {
        if(Character.isUpperCase(word.charAt(0))){
            if(word.length()>=2){
                if(Character.isUpperCase(word.charAt(1))){
                    for (int i = 2; i <word.length() ; i++) {
                        if(Character.isLowerCase(word.charAt(i))){
                            return false;
                        }
                    }
                }else{
                    for (int i = 2; i <word.length() ; i++) {
                        if(Character.isUpperCase(word.charAt(i))){
                            return false;
                        }
                    }
                }
            }
            return true;
        }else{
            for (int i = 1; i <word.length() ; i++) {
                if(Character.isUpperCase(word.charAt(i))){
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args){
        String word="Two";
        System.out.println(detectCapitalUse(word));
    }
}
