package TCSNQT_CODING;

import java.util.Scanner;

public class QUES_13 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ;
        System.out.println(solution_Ques_13.getProduct(N));
    }
}
class solution_Ques_13 {
    public static int getProduct(int N){
        int prdt = 1 ;
        while (N != 0){
            int remainder = N % 10 ;
            prdt = prdt * remainder ;
            N = N/10 ;
        }

        return prdt ;
    }
}