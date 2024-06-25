package TCSNQT_CODING.Sorting;

import java.util.Arrays ;
public class mergeSort {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        sort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }
    private static void merge(int[] arr , int l , int m , int h){
        int[] temp = new int[h - l + 1] ;
        int i = l , j = m + 1 ;
        int index = 0 ;
        while (i <= m && j <= h){
            if (arr[i] < arr[j]){
                temp[index] = arr[i] ;
                i ++ ;
            }else {
                temp[index] = arr[j] ;
                j ++ ;
            }
            index ++ ;
        }
        while (i <= m){
            temp[index] = arr[i] ;
            i ++ ;
            index ++ ;
        }
        while (j <= h){
            temp[index] = arr[j] ;
            j ++ ;
            index ++ ;
        }

        for (int idx = l ; idx <= h ; idx ++){
            arr[idx] = temp[idx - l] ;
        }
    }
    private static void sort (int[] arr , int l , int h){
        int m = l + (h-l)/2 ;
        if (l < h){
            sort(arr , l ,  m);
            sort(arr , m + 1 ,  h);
            merge(arr, l,  m, h);
        }
    }// O(n log n) - all
}
