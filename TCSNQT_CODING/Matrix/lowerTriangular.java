package TCSNQT_CODING.Matrix;

import java.util.Arrays;

public class lowerTriangular {
    public static void main(String[] args) {
        Solution_Matrix_3 object = new Solution_Matrix_3() ;
        int[][] lowerMat = object.lowerTriangular(new int[][]{
                {1, 2, 3, 10} ,
                {4, 5, 6, 11} ,
                {7, 8, 9, 12} ,
                {13, 14, 15, 16}
        }) ;
        for (int[] arr : lowerMat){
            System.out.println(Arrays.toString(arr));
        }
    }
}
class Solution_Matrix_3 {
    public int[][] lowerTriangular(int[][] matrix){
        int R = matrix.length ;
        int C = matrix[0].length ;

        for (int i = 0 ; i < R ; i ++){
            if (i < R - 1) {
                for (int j = i + 1; j < C; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        return matrix ;
    }
}