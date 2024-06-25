package TCSNQT_CODING.Sorting;

import java.util.Arrays;

// Repeatedly finds the minimum element from the unsorted part and swaps it with the first unsorted element.
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = ArrayExample.num ;
        System.out.println(Arrays.toString(sort(arr,arr.length)));
    }
    private static int[] sort(int[] arr , int n){
        for (int i = 0 ; i < n - 1 ; i ++){
            int min_idx = i  ;
            for (int j = i + 1 ; j < n ; j ++)
                if(arr[j] < arr[min_idx])
                    min_idx = j ;
            int temp = arr[i] ;
            arr[i] = arr[min_idx] ;
            arr[min_idx] = temp ;
        }

        return arr ;
    }// O(n*n) - all
    // O(1) - space
}
