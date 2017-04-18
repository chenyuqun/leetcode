import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/4/13.
 */
public class FizzBuzz {
        public  static List<String> fizzBuzz(int n) {
            List<String> stringList=new ArrayList<>();
            for(int i=1;i<=n;i++){
                if(i%15==0){
                    stringList.add("FizzBuzz");
                }else if(i%3==0){
                    stringList.add("Fizz");
                }else if(i%5==0){
                    stringList.add("Buzz");
                }else{
                    stringList.add(String.valueOf(i));
                }
            }
            return stringList;
        }

    public static void main(String[] args){
        List<String> stringList=fizzBuzz(15);
    }
}
