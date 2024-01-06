package TCSNQT_CODING;

import java.util.Scanner;

/**
 * Q1. A carpet manufacturing industry has newly ventured into the carpet installation business.
       All the carpets manufactured are large squares in shape. To install, each carpet has to be
       cut into shapes of squares or rectangles. The number of slits to be made is given as N.
       The task is to find the maximum number of equal squares or rectangles that can be achieved
       using N slits.
   Note:
       The square carpet can be cut only using horizontal or vertical slits.
       Cuttings are done on a single carpet which should be rolled out completely i.e. no folding or stacking is
       allowed.
       Squares or rectangles cut should be equal size.
   Example 1:
   Input:
       4 → Value of N(No. of cuts)
   Output:
       9 → maximum number of equal squares or rectangles
   Explanation:
       Solution 2
       Maximum number of squares/rectangles that can be obtained with N=4 is 9(Solution 1)
       Hence, output is 9
   Example 2:
   Input:
       1 → Value of N(No. of cuts)
   Output:
       2 → maximum number of equal squares or rectangles
 */
public class QUES_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ;
        System.out.println(solution_Ques_5.maxCarpet(N));
    }
}
class solution_Ques_5 {
    public static int maxCarpet(int N){
        int x = N/2 ;
        return (x + 1)*(N - x +1) ;
    }
}