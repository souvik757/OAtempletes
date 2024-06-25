package TCSNQT_CODING.Sorting;

import java.util.Arrays;

// Iteratively takes the next unsorted element and
// inserts it into the correct position within the sorted portion of the array.
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = ArrayExample.num ;
        System.out.println(Arrays.toString(sort(arr,arr.length)));
    }
    private static int[] sort(int[] arr , int n){
        for (int i = 1 ; i < n ; i ++){
            int key = arr[i] ;
            int j = i - 1 ;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j] ;
                j = j - 1 ;
            }
            arr[j + 1] = key ;
        }// O(n) - best , O(n*n) - rest
        // O(1) - space

        return arr ;
    }
}
