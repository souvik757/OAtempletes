package TCSNQT_CODING;

import java.util.Scanner ;
/**
 * Factorial without using multiplication operator
 *  5 * 4 * 3 * 2 * 1
 * (5+5+5+5) * 3 * 2 * 1
 * (20+20+20) * 2 * 1
 * (60+60) * 1
 *  120
 * n = 5
 * 4 3 2 1
 * -> 5+5+5+5
 * ---------> 20
 * 3 2 1
 * -> 20+20+20
 * ---------> 60
 * 2 1
 * -> 60+60
 * ---------> 120
 * 1
 * -> 120
 * ---------> 120
 */
public class QUES_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int ans = new Solution_Ques_14().factorialWithoutMul(n) ;
        System.out.println(ans) ;
    }
}
class Solution_Ques_14 {
    public int factorialWithoutMul(int N) {
        int ans = N ;

        for (int i = N-1 ; i > 0 ; i --) {
            int sum = 0 ;
            for (int j = 0 ; j < i ; j ++)
                sum += ans ;
            ans = sum ;
        }

        return ans ;
    }
}