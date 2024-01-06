package TCSNQT_CODING;


/**
 * Given an array Arr[] of size T, contains binary digits.
    Where
    0 represents a biker running to the north.
    1 represents a biker running to the south.
    The task is to count crossing bikers in such a way that each pair of crossing bikers (N, S), where 0<=N<S<T,
    is passing when N is running to the north and S is running to the south.
 */

import java.util.Scanner;

/**
 * Input:
    5. -> Number of elements i.e. T
    0. -> Value of 1st element
    1. -> Value of 2nd element
    0. -> Value of 3rd element
    1. -> Value of 4th element
    1. -> Value of 5th element
 * Output:
    5
 * Explanation:
    The 5 pairs are (Arr[0], Arr[1]), (Arr[0], Arr[3]), (Arr[0], Arr[4]), (Arr[2], Arr[3]) and (Arr[2], Arr[4]).
 */
public class QUES_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int T = scanner.nextInt() ;
        int[] Arr = new int[T] ;
        for (int i = 0 ; i < T ; i ++)
            Arr[i] = scanner.nextInt() ;
        System.out.println(solution_Ques_3.countPairs(T,Arr)) ;
    }
}
class solution_Ques_3 {
    public static int countPairs(int T , int[] arr){
        int count = 0 ;
        for (int i = 0 ; i < T ; i ++){
            if(arr[i] == 0){
                for (int j = i + 1 ; j < T ; j ++){
                    if(arr[j] == 1)
                        count ++ ;
                }
            }
        }
        return count ;
    }
}
