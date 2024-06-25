package TCSNQT_CODING.Sorting;

import java.util.Arrays;

//Selects a 'pivot' element,
// partitions the array into elements less than and greater than the pivot,
// and recursively sorts the partitions.

public class quickSort {
    public static void main(String[] args) {
        int[] arr = ArrayExample.num ;
        sort(arr,0 , arr.length-1) ;
        System.out.println(Arrays.toString(arr));
    }
    private static int partition(int[] arr , int start , int end){
        int pivot = arr[end] ;
        int i = start - 1 ;
        for (int j = start ; j <= end ; j ++){
            if (arr[j] < pivot){
                i ++ ;
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
            }
        }
        i ++ ;
        int temp = arr[i] ;
        arr[i] = arr[end] ;
        arr[end] = temp ;

        return i ;
    }
    private static void sort(int[] arr , int start , int end){
        if (start < end){
            int pivot = partition(arr , start , end) ;
            sort(arr , start , pivot - 1);
            sort(arr , pivot + 1 , end);
        }
    }// O(n*n) - worst case O(n log n) - rest
    // O(log n) - best , avg O(n) - worst
}
