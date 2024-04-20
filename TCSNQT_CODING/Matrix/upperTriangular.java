package TCSNQT_CODING.Matrix;

import java.util.Arrays;

public class upperTriangular {
    public static void main(String[] args) {
        Solution_Matrix_2 object = new Solution_Matrix_2() ;
        int[][] upperMat = object.upperTriangular(new int[][]{
                {1, 2, 3, 10} ,
                {4, 5, 6, 11} ,
                {7, 8, 9, 12} ,
                {13, 14, 15, 16}
        }) ;
        for (int[] arr : upperMat){
            System.out.println(Arrays.toString(arr));
        }
    }
}
class Solution_Matrix_2 {
    public int[][] upperTriangular(int[][] matrix){
        int R = matrix.length ;
        int C = matrix[0].length ;

        for (int i = 0 ; i < R ; i ++){
            for (int j = 0 ; j < i ; j ++){
                matrix[i][j] = 0 ;
            }
        }

        return matrix ;
    }
}