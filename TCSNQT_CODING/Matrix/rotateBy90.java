package TCSNQT_CODING.Matrix;

import java.util.Arrays;

public class rotateBy90 {
    public static void main(String[] args) {
        Solution_Matrix_4 object = new Solution_Matrix_4() ;
        int[][] rotatedImg = object.rotateBy90(new int[][]{
                {1, 2, 3} ,
                {4, 5, 6} ,
                {7, 8, 9}
        }) ;
        for (int[] arr : rotatedImg){
            System.out.println(Arrays.toString(arr));
        }
    }
}
class Solution_Matrix_4 {
    public int[][] rotateBy90(int[][] img){
        int R = img.length ;
        int C = img[0].length ;

        for (int i = 0 ; i < R ; i ++){
            for (int j = 0 ; j < i ; j ++){
                int temp = img[i][j] ;
                img[i][j] = img[j][i] ;
                img[j][i] = temp ;
            }
        }

        int j = 0 ;
        int mid = C / 2 ;
        while (j < mid){
            for (int i = 0 ; i < R ; i ++){
                int temp = img[i][j] ;
                img[i][j] = img[i][C - j - 1] ;
                img[i][C - j - 1] = temp ;
            }
            j ++ ;
        }

        return img ;
    }
}