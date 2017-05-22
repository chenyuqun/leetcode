import java.util.ArrayList;
import java.util.List;

/**
 * No.118
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5,
 * Return
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 */
public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for (int i = 0; i <numRows ; i++) {
            List<Integer> layer=new ArrayList<>();
            layer.add(0,1);
            for (int j = 1; j <i+1; j++) {
                if(j==i){
                    layer.add(j,1);
                }else{
                    layer.add(j,(result.get(i-1).get(j-1)+result.get(i-1).get(j)));
                }
            }
            result.add(layer);
        }

        return result;

    }

    public static void main(String[] args){
        generate(5).stream().forEach(System.out::println);
    }
}
