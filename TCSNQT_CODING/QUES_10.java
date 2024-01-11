package TCSNQT_CODING;


import java.util.* ;

/**
   Tina was given a piece of silk cloth.
   There are already a few points or coordinates mentioned on it.
   She is creating something which needs an exact square shape cloth.
   Help Tina to find out how many minimum points she can add, to cut the perfect square from the given cloth.
   There are already a few points marked on one cloth,
   Tina has to include the most number of points from the given points and should try to include the minimum
   number of points or coordinates from her side.

   Find the minimum number of coordinates to achieve the perfect square.
   Also, try to get as bigger cloth as possible.

   Let us try to understand it with an example Let’s say there are 3 points given,
   which means N=3 These points are
   0 , 0
   2 , 2
   3 , 3
   We can have 2 additional coordinates:

   (2,0) & (0,2)
   OR
   (3,0) & (0,3)
   Tina does not want to lose a good deal here, so better if she would go with (3,0) & (0,3).
   Hence, 2 additional coordinates were required to cut a perfect square from that piece of cloth.
   Hence, the answer is 2

   Example 1:

   Input:
   5 -> Input integer, N
   0 0 -> Input integer, x[i], y[i]
   100 100 -> Input integer, x[i], y[i]
   200 200 -> Input integer, x[i], y[i]
   100 0 -> Input integer, x[i], y[i]
   0 100 ->Input integer, x[i], y[i]
   Output:
   0 -> Output
   Explanation:
   In the above scenario, we can already make a square from the given coordinates
   P1: (0, 0)
   P2: (100, 0)
   P3: (0, 100)
   P4: (100, 100)
   Hence no need for any additional coordinates here.
   So the answer is No.
   Example 2:

   Input:
   3 -> Input integer. N
   00 -> Input integer, x[i], y[i]
   22 -> Input integer, x[i], y[i]
   33 -> Input integer, x[i], y[i]
   Output:
   2 -> Output
   Explanation:
   In the above scenario, we can have 2 additional coordinates:
   (20)&(0,2)
   OR
   (3,0) & (0,3)
   Tina does not want to lose a good deal here so better if she would go with (3,0), (0,3).
   Hence, 2 additional coordinates were required to cut a perfect square from that piece of cloth.
   Hence, the answer is 2.
 */
public class QUES_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // Number of points
        int[][] coordinates = new int[N][2];

        for (int i = 0; i < N; i++) {
            coordinates[i][0] = scanner.nextInt();
            coordinates[i][1] = scanner.nextInt();
        }
    }
}
class solution_Ques_10 {
}