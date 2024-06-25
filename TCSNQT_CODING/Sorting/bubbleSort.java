package TCSNQT_CODING.Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{5,4,-1,0,3,2,1})));
    }
    private static int[] sort(int[] arr){
        int n = arr.length ;
        for (int i = 0 ; i < n ; i ++){
            for (int j = i + 1 ; j < n ; j ++){
                if (arr[i] > arr[j]){
                    int temp = arr[i] ;
                    arr[i] = arr[j] ;
                    arr[j] = temp ;
                }
            }
        }// O(n) - best O(n*n) - rest
        // O(1) space
        return arr ;
    }
}
