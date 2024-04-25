import java.util.* ;
public class RUNDEBUG {
    public static void main(String[] args)
    {
//        System.out.println(gcd(20,30)) ;
//        System.out.println(lcm(20,30)) ;
        inverseOfMat(new int[][]{
                {0, 0, 2} ,
                {3, 4, 8} ,
                {7, 1, 2}
        });
    }
    public static void inverseOfMat(int[][] mat){
        int n = mat.length ;
        int det = detOfMat(mat,n) ;
        int[][] adj = new int[n][n] ;
        String[][] inverse = new String[n][n] ;
        adjOfMat(mat , adj , n) ;

        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j ++){
                if (adj[i][j] == 0)
                    inverse[i][j] = "0" ;
                else {
                    int div = gcd(adj[i][j] , det) ;
                    int numerator = adj[i][j] / div ;
                    int deNumerator = det / div ;
                    inverse[i][j] = numerator + "/" + deNumerator;
                }
            }
        }

        System.out.println("factor :"+" 1/"+det);
        for (String[] arr : inverse)
            System.out.println(Arrays.toString(arr));
    }
    private static void getCofactorMat(int[][] A , int[][] cofactor , int r , int c , int n){
        int row = 0 , col = 0 ;
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j ++){
                if (i != r && j != c){
                    cofactor[row][col++] = A[i][j] ;
                    if (col == n - 1){
                        col = 0 ;
                        row ++ ;
                    }
                }
            }
        }
    }
    private static int detOfMat(int[][] mat, int n) {
        int det = 0 ;
        if (n == 1)
            return mat[0][0] ;
        int sign = 1 ;
        int[][] cofactor = new int[n][n] ;
        for (int i = 0 ; i < n ; i ++){
            getCofactorMat(mat , cofactor , 0 , i , n);
            det += sign * mat[0][i] * detOfMat(cofactor,n - 1) ;
            sign = - sign ;
        }
        return det ;
    }

    private static void adjOfMat(int[][] mat, int[][] adj, int n) {
        if (n == 1){
            adj[0][0] = mat[0][0] ;
            return ;
        }
        int sign = 1 ;
        int[][] cofactor = new int[n][n] ;
        for (int i = 0 ; i < n ; i ++){
            for (int j = 0 ; j < n ; j ++){
                getCofactorMat(mat , cofactor , i , j , n);
                sign = ((i+j) % 2 == 0) ? 1 : -1 ;
                adj[j][i] = sign * detOfMat(cofactor , n-1) ;
            }
        }
    }
    private static int gcd (int a , int b){
        if (b == 0)
            return a ;
        return gcd(b , a%b) ;
    }
    private static int lcm (int a , int b){
        return Math.abs(a*b) / gcd(a,b) ;
    }
}

