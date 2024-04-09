package TCSNQT_CODING;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem Description -: Given an array Arr[ ] of N integers and a positive integer K. The task is to cyclically rotate the array clockwise by K.
 * Note : Keep the first of the array unaltered.
 * Example 1:
 *     5  —Value of N
 *     {10, 20, 30, 40, 50}  —Element of Arr[ ]
 *     2  —–Value of K
 * Output :
 * 40 50 10 20 30
 * Example 2:
 *     4  —Value of N
 *     {10, 20, 30, 40}  —Element of Arr[]
 *     1  —–Value of K
 * Output :
 * 40 10 20 30
 */
public class QUES_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int k = sc.nextInt() ;
        int[] arr = new int[n] ;
        for (int i = 0 ; i < n ; i ++)
            arr[i] = sc.nextInt() ;
        Solution_Ques_15 obj = new Solution_Ques_15() ;
        obj.rotateByK(arr,k) ;
        System.out.println(Arrays.toString(arr));
    }
}
class Solution_Ques_15 {
    private void rotate(int[] arr , int s , int l){
        int temp ;
        while (s <= l){
            temp = arr[s] ;
            arr[s] = arr[l] ;
            arr[l] = temp ;
            s ++ ;
            l -- ;
        }
    }
    public void rotateByK(int[] arr , int k){
        int size = arr.length ;
        k = k % size ;
        rotate(arr , 0 , size - 1);
        rotate(arr , 0 , k - 1);
        rotate(arr , k , size - 1);
    }
}