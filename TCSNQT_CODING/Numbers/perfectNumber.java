package TCSNQT_CODING.Numbers;

public class perfectNumber {
    public static void main(String[] args){
        Solution_Numbers_3 object = new Solution_Numbers_3() ;
        System.out.println(object.isPerfect(6));
        System.out.println(object.isPerfect(28));
        System.out.println(object.isPerfect(496));
        System.out.println(object.isPerfect(8128));
    }
}
class Solution_Numbers_3 {
    public boolean isPerfect(int N){
        int sum = 0 ;
        for (int i = 1; i <= N /2 ; i ++){
            if(N % i == 0)
                sum += i ;
        }

        return sum == N ;
    }
}