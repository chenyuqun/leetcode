/**
 * No 461
 * Created by alexchen on 2017/4/12.
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * Given two integers x and y, calculate the Hamming distance.
 * Note:
 * 0 ≤ x, y < 231.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {

        String a=Integer.toBinaryString(x^y);
        String b=a.replace("0","");
        return b.length();
    }

    public static void main(String[] args){
        System.out.println(hammingDistance(1,4));
    }
}
