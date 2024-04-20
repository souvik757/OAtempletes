package TCSNQT_CODING.Matrix;

import java.util.Arrays;

public class gameOfLife {
    public static void main(String[] args) {
        Solution_Matrix_5 object = new Solution_Matrix_5() ;
        int[][] nextGen = object.gameOfLife(new int[][]{
                {0,1,0} ,
                {0,0,1} ,
                {1,1,1} ,
                {0,0,0}
        }) ;
        for (int[] arr : nextGen)
            System.out.println(Arrays.toString(arr));
    }
}
class Solution_Matrix_5 {
    private static int[] delRow = new int[]{1,0,-1,0,1,-1,1,-1} ;
    private static int[] delCol = new int[]{0,-1,0,1,1,-1,-1,1} ;
    public int[][] gameOfLife(int[][] matrix){
        int index = 0 ;
        int R = matrix.length ;
        int C = matrix[0].length ;
        int[][] copy = new int[R][C] ;
        for (int[] arr : matrix)
            copy[index++] = arr.clone() ;
        for (int i = 0 ; i < R ; i ++){
            for (int j = 0 ; j < C ; j ++)
                matrix[i][j] = nextGen(i,j,copy) ;
        }

        return matrix ;
    }

    private int nextGen(int i, int j, int[][] copy) {
        int initial = copy[i][j] ;
        int count = 0 ;
        int[] neighbours = new int[8] ;
        Arrays.fill(neighbours , -1) ;
        for (int idx = 0 ; idx < 8 ; idx ++){
            int nRow = i + delRow[idx] ;
            int nCol = j + delCol[idx] ;
            if (nRow >= 0 && nCol >= 0 && nRow < copy.length && nCol < copy[0].length)
                neighbours[idx] = copy[nRow][nCol] ;
        }
        for (int val : neighbours){
            if (val == 1)
                count ++ ;
        }
        if (copy[i][j] == 1){
            if (count == 2 || count == 3)
                return 1 ;
            else if(count < 2 || count > 3)
                return 0 ;
        }else {
            if (count == 3)
                return 1 ;
        }
        return initial ;
    }
}