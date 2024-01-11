package TCSNQT_CODING;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner ;

public class QUES_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ;
        int[] arr = new int[N] ;
        for (int i = 0 ; i < N ; i ++)
            arr[i] = sc.nextInt() ;
        System.out.println(solution_Ques_11.countMaxBet(N,arr));
    }
}
class solution_Ques_11 {
    public static int countMaxBet(int N, int[] boardPos) {
        int count = 0;
        int[] arr = new int[N] ;

        for (int i = 0 ; i < N ; i ++)
            arr[i] = i + 1 ;
        int[] storeArr1 = new int[N] ;
        for (int i = 0 ; i < N ; i ++){
            storeArr1[boardPos[i] - 1] = arr[i] ;
        }
        for (int i = 0 ; i < N ; i ++){
            arr[i] = storeArr1[i] ;
        }

        count ++ ;

        while (!isSorted(arr)){
            int[] storeArr = new int[N] ;
            for (int i = 0 ; i < N ; i ++){
                storeArr[boardPos[i] - 1] = arr[i] ;
            }
            for (int i = 0 ; i < N ; i ++){
                arr[i] = storeArr[i] ;
            }
            count ++ ;
        }

        return count;
    }
    public static boolean isSorted(int[] arr){
        int N = arr.length ;
        for (int i = 1 ; i < N ; i ++){
            if(arr[i] < arr[i-1])
                return false ;
        }
        return true ;
    }
}