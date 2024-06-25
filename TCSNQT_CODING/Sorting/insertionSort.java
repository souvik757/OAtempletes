package TCSNQT_CODING.Sorting;

import java.util.Arrays;

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

        return arr ;
    }
}
