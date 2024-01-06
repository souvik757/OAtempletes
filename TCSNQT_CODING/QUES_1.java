package TCSNQT_CODING;

import java.util.Arrays;

/**
 * Problem Statement –
 A chocolate factory is packing chocolates into the packets.
 The chocolate packets here represent an array  of N number of integer values.
 The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
Example 1 :
N=8 and arr = [4,5,0,1,9,0,5,0].
There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array
Input :
8  – Value of N
[4,5,0,1,9,0,5,0] – Element of arr[O] to arr[N-1],While input each element is separated by newline
Output:
4 5 1 9 5 0 0 0
Example 2:
Input:
6 — Value of N.
[6,0,1,8,0,2] – Element of arr[0] to arr[N-1], While input each element is separated by newline
Output:
6 1 8 2 0 0
 */
public class QUES_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 5, 0, 3, 0, 8, 0} ;
        System.out.println(Arrays.toString(solution_Ques_1.sorted(arr)));
    }
}
class solution_Ques_1 {
    public static int[] sorted(int[] arr){
        int s = 0 ;
        int e = arr.length - 1 ;
        while (s <= e){
            if(arr[s] == 0 && arr[e] == 0)
                e -- ;
            else if(arr[s] != 0 && arr[e] != 0)
                s ++ ;
            else if(arr[s] == 0 && arr[e] != 0)
            {
                int temp = arr[s] ;
                arr[s] = arr[e] ;
                arr[e] = temp ;
                s ++ ;
            }
            else if(arr[s] != 0 && arr[e] == 0)
                s ++ ;
        }

        return arr ;
    }
}
