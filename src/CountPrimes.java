/**
 * No.204
 * Count the number of prime numbers less than a non-negative number, n.
 */
public class CountPrimes {
    public static int countPrimes(int n) {
        Boolean[] nums=new Boolean[n];
        for(int i=2;i<n;i++){
            nums[i]=true;
        }
        for(int i=2;i*i<n;i++){
            if(isPrime(i)){
                for (int j = i*i; j <n ; j+=i) {
                    nums[j]=false;
                }
            }
        }
        int result=0;
        for (int i = 2; i <n ; i++) {
            if(nums[i]) result++;
        }
        return result;
    }

    private static boolean isPrime(int n){
        if(n<=1) return false;
        int divisor=(int)Math.sqrt(n);
        for(int i=2;i<=divisor;i++){
            if(n%i==0&&n/i>=2){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println(countPrimes(50));
    }
}
