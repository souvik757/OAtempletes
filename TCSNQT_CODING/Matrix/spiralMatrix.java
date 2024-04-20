package TCSNQT_CODING.Matrix;
import java.util.List ;
import java.util.ArrayList ;
public class spiralMatrix {
    public static void main(String[] args) {
        Solution_Matrix_1 obj = new Solution_Matrix_1() ;
        System.out.println(obj.spiralOrder(new int[][]{
                {1, 2, 3} ,
                {4, 5, 6} ,
                {7, 8, 9}
        }));
    }
}
class Solution_Matrix_1 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> answer = new ArrayList<>() ;
        int R = matrix.length , C = matrix[0].length ;

        int top = 0 , left = 0 , bottom = R - 1 , right = C - 1 ;

        while (top <= bottom && left <= right){
            // left to right
            for (int i = left ; i <= right ; i ++){
                answer.add(matrix[top][i]) ;
            }
            top ++ ;
            // top to bottom
            for (int i = top ; i <= bottom ; i ++){
                answer.add(matrix[i][right]) ;
            }
            right -- ;
            // right to left
            if (top <= bottom){
                for (int i = right ; i >= left ; i --){
                    answer.add(matrix[bottom][i]) ;
                }
                bottom -- ;
            }
            // bottom to top
            if (left <= right){
                for (int i = bottom ; i >= top ; i --){
                    answer.add(matrix[i][left]) ;
                }
                left ++ ;
            }
        }

        return answer ;
    }
}