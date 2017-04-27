import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * No 500.
 * Created by alexchen on 2017/4/12.
 * Given a List of words, return the words that can be typed using
 * letters of alphabet on only one row's of American keyboard like the image below.
 * Input: ["Hello", "Alaska", "Dad", "Peace"]
 * Output: ["Alaska", "Dad"]
 * You may use one character in the keyboard more than once.
 * You may assume the input string will only contain letters of alphabet.
 **/
public class KeyboardRow {
    public static String[] findWords(String[] words) {
        String[] fisrtRow = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
                "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"};
        String[] secondRow = {"a", "s", "d", "f", "g", "h", "j", "k", "l",
                "A", "S", "D", "F", "G", "H", "J", "K", "L"};
        String[] thirdRow = {"z", "x", "c", "v", "b", "n", "m", "Z", "X", "C",
                "V", "B", "N", "M"};
        List<String> fistrRowList = Arrays.asList(fisrtRow);
        List<String> secondRowList = Arrays.asList(secondRow);
        List<String> thirdRowList = Arrays.asList(thirdRow);
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (fistrRowList.contains(String.valueOf(words[i].charAt(0)))) {
                Boolean flag = true;
                for (int j = 1; j < words[i].length(); j++) {
                    if (!fistrRowList.contains(String.valueOf(words[i].charAt(j)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    stringList.add(words[i]);
                }
            } else if (secondRowList.contains(String.valueOf(words[i].charAt(0)))) {
                Boolean flag = true;
                for (int j = 1; j < words[i].length(); j++) {
                    if (!secondRowList.contains(String.valueOf(words[i].charAt(j)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    stringList.add(words[i]);
                }
            } else if (thirdRowList.contains(String.valueOf(words[i].charAt(0)))) {
                Boolean flag = true;
                for (int j = 1; j < words[i].length(); j++) {
                    if (!thirdRowList.contains(String.valueOf(words[i].charAt(j)))) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    stringList.add(words[i]);
                }
            }
        }
        return stringList.toArray(new String[stringList.size()]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] result = findWords(words);
        System.out.println(words[0].charAt(1));
    }
}
