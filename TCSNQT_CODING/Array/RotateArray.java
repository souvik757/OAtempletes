package TCSNQT_CODING.Array;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        Solution_Arr_4 object = new Solution_Arr_4() ;
        System.out.println(Arrays.toString(object.rotateByK(new int[]{1,2,3,4,5,6,7} , 3)));
    }
}
class Solution_Arr_4 {
    private void reverse(int[] num , int s , int e){
        while (s <= e){
            int temp = num[s] ;
            num[s] = num[e] ;
            num[e] = temp ;
            s ++ ;
            e -- ;
        }
    }
    public int[] rotateByK(int[] num , int k){
        k = k % num.length ;

        reverse(num , 0 , num.length-1);
        reverse(num , 0 , k-1);
        reverse(num , k , num.length-1);

        return num ;
    }
}