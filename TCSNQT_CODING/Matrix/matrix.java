package TCSNQT_CODING.Matrix;

import java.util.Arrays;

/**
 * a. addition
 * b. subtraction
 * c. multiplication
 * d. transpose
 * e. inverse
 */
public class matrix {
    public static void main(String[] args) {
        Solution_Matrix_6 object = new Solution_Matrix_6() ;
        object.inverseOfMat(new int[][]{
                {0 , 0 , 1} ,
                {9, 14 , 2} ,
                {5 , 8 , 3}
        });
    }
}
class Solution_Matrix_6 {
    public int[][] addition(int[][] A, int[][] B){
        int R = A.length ;
        int C = A[0].length ;
        int[][] answer = new int[R][C] ;
        for (int i = 0 ; i < R ; i ++){
            for (int j = 0 ; j < C ; j ++){
                answer[i][j] = A[i][j] + B[i][j] ;
            }
        }
        return answer ;
    }
    public int[][] subtraction(int[][] A, int[][] B){
        int R = A.length ;
        int C = A[0].length ;
        int[][] answer = new int[R][C] ;
        for (int i = 0 ; i < R ; i ++){
            for (int j = 0 ; j < C ; j ++){
                answer[i][j] = A[i][j] - B[i][j] ;
            }
        }
        return answer ;
    }
    public int[][] multiplication(int[][] A, int[][] B){
        int R1 = A.length ;
        int C1 = A[0].length ;
        int R2 = B.length ;
        int C2 = B[0].length ;
        // Assuming, C1 == R2
        int[][] answer = new int[R1][C2] ;
        for (int i = 0 ; i < R1 ; i ++){
            for (int j = 0 ; j < C2 ; j ++){
                int sum = 0 ;
                for (int k = 0 ; k < C2 ; k ++){
                    sum += A[i][k] * B[k][j] ;
                }
                answer[i][j] = sum ;
            }
        }
        return answer ;
    }
    public int[][] transpose(int[][] matrix){
        int R = matrix.length ;
        int C = matrix[0].length ;

        for (int i = 0 ; i < R ; i ++){
            for (int j = 0 ; j < i ; j ++){
                int temp = matrix[i][j] ;
                matrix[i][j] = matrix[j][i] ;
                matrix[j][i] = temp ;
            }
        }

        return matrix ;
    }
    private void getCofactor(int[][] mat , int[][] cofactorMat , int r , int c , int n){
        int row = 0 , col = 0 ;
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j ++){
                if (i != r && j != c) {
                    cofactorMat[row][col++] = mat[i][j] ;
                    if (col == n - 1){
                        col = 0 ;
                        row ++ ;
                    }
                }
            }
        }
    }
    private int detOfMatrix(int[][] mat , int n){
        int det = 0 ;
        if (n == 1)
            return mat[0][0] ;
        int sign = 1 ;
        int[][] cofactorMat = new int[n][n] ;

        for (int i = 0 ; i < n ; i ++){
            getCofactor(mat,cofactorMat,0,i,n);
            det += sign * mat[0][i] * detOfMatrix(cofactorMat , n-1) ;
            sign = -sign ;
        }

        return det ;
    }
    private void adjOfMat(int[][] A , int[][] adj , int n){
        if (n == 1) {
            adj[0][0] = 1 ;
            return ;
        }
        int sign = 1 ;
        int[][] cofactorMat = new int[n][n] ;
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j ++){
                getCofactor(A , cofactorMat , i , j , n);
                sign = ((i + j) % 2 == 0) ? 1 : -1 ; // ***
                adj[j][i] = (sign) * detOfMatrix(cofactorMat , n-1) ;
            }
        }
    }
    public void inverseOfMat(int[][] A) {
        // assuming,
        // A is a square matrix
        // det|A| != 0
        int n = A.length ;
        int det = detOfMatrix(A , n) ;
        System.out.println("det "+det);
        int[][] adj = new int[n][n] ;
        adjOfMat(A,adj,n);
        for (int i = 0 ; i < n ; i ++){
            if (i == ((n-1) / 2))
                System.out.println(Arrays.toString(adj[i])+" X "+"(1/"+det+")");
            else
                System.out.println(Arrays.toString(adj[i]));
        }
    }
}