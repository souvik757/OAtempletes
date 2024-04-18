package TCSNQT_CODING.Numbers;

public class asSumOfTwoPrime {
    public static void main(String[] args) {
        Solution_Numbers_8 object = new Solution_Numbers_8() ;
        System.out.println(object.canBeExpressed(74));
        System.out.println(object.canBeExpressed(19));
    }
}
class Solution_Numbers_8 {
    private boolean isPrime(int N) {
        if(N <= 1)
            return false ;
        for (int i = 2 ; i <= N/2 ; i ++){
            if(N % i == 0)
                return false ;
        }
        return true ;
    }
    public boolean canBeExpressed(int N){
        if (isPrime(N) && isPrime(N-2))
            return true ;
        return false ;
    }
}