package TCSNQT_CODING;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Let us break the array elements into following sub-arrays:
   1. (8,1) → Max:8 Min:1
   2. (7,9,2) → Max:9 Min:2
   So, the difference between the maximum and minimum elements in each sub-arrays is
   1. 8-1=7
   2.9-2=7
   Now, the sum of the differences of sub-array is:
   7+7=14
   Hence, output is 14.

   Example 2:
   Input:
   5 → Value of N
   {1,2,1,0,5} → arr[], elements from arr[0] to arr [N-1],
   where each element is separated by a new line.
   Output:
   6
   Explanation:
   Let us break the array elements into following sub-arrays:
   1. (1,2,1) → max:2, min:1
   2. (0,5) → max:5, min:0
   So, the difference between the max and min elements in each sub-array is
   1. 2-1 = 1
   2. 5-0 = 5
   Now, the sum of the differences of sub-array is:
   1+5 = 6
   Hence, output is 6.
   The input format for testing
   The candidate has to write the code to accept 2 inputs.
   First input - Accept value for N(positive integer number)
   Second input - Accept N number of values (arr[]), where each value is separated by a new line.
 */
public class QUES_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int N = scanner.nextInt() ;
        int[] arr = new int[N] ;
        for (int i = 0 ; i < N ; i ++)
            arr[i] = scanner.nextInt() ;
        System.out.println(solution_Ques_6.maxDifference(arr));
    }
}
class solution_Ques_6 {
    public static int maxDifference(int[] arr){
        Arrays.sort(arr);
        int sum = 0 ;
        int N = arr.length ;
        for (int i = 0 ; i < N/2 ; i ++){
            sum += (arr[i] - arr[N-i-1]) ;
        }

        return sum ;
    }
}