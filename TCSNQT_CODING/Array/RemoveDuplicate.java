package TCSNQT_CODING.Array;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Solution_Arr_2 object = new Solution_Arr_2() ;
        System.out.println(Arrays.toString(object.sorted(new int[]{1,1,2,2,2,3,3,4})));
        System.out.println(Arrays.toString(object.unsorted(new int[]{2,3,1,9,3,1,3,9})));
    }
}
class Solution_Arr_2 {
    public int[] sorted(int[] num){
        int count = 0 ;
        int start = 0 ;
        int index = 1 ;
        int n = num.length ;
        while (index < n){
            if(num[index] != num[start]){
                start ++ ;
                num[start] = num[index] ;
            }
            index ++ ;
        }
        count = start + 1 ;
        int idx = 0 ;
        int[] removed = new int[count] ;
        for (int i = 0 ; i < count ; i ++){
            removed[idx++] = num[i] ;
        }
        return removed ;
    }
    public int[] unsorted(int[] num){
        int n = num.length ;
        int[] mark = new int[n] ;
        for (int i = 0 ; i < n ; i ++)
            mark[i] = 1 ;
        for (int i = 0 ; i < n ; i ++){
            if(mark[i] == 1){
                for (int j = i + 1 ; j < n ; j ++){
                    if(num[j] == num[i]){
                        mark[j] = 0 ;
                    }
                }
            }
        }
        int length = 0 ;
        for (int i = 0 ; i < n ; i ++){
            if (mark[i] == 1)
                length ++ ;
        }
        int idx = 0 ;
        int[] removed = new int[length] ;
        for (int i = 0 ; i < n ; i ++){
            if (mark[i] == 1){
                removed[idx++] = num[i] ;
            }
        }
        return removed ;
    }
}