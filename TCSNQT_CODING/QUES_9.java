package TCSNQT_CODING;

/**
 * This vacation you went to visit the golden house.
 * There are N rooms in this golden house and its owner needs someone to take care of the management of this house.
 * As you have been unemployed for a long time, you are interested in this job.
 * The owner of this house wanted an intelligent manager for this role, so he created one puzzle within that golden house.
 * The person who will be able to solve that puzzle will be the manager of the golden house.
 * The owner of the house kept some number of golden coins in each room.
 * You have to choose two rooms, one from where you will enter and the other one from where you will exit.
 * From any room either you can exit, or you can move to the next room.
 * While visiting any room you will collect all the gold coins, and if you enter any room then you can’t skip
 * collecting gold coins from that room, you have to take those coins.
 * The owner wants to have exactly K coins, when you exit the room, he guarantees that
 * there will be at least one possible solution for this puzzle.

   Given several rooms (N), and several gold coins in N rooms.
 You have to find room numbers from where you will start and from where you will exit.
 If there is more than one solution possible, then you have to provide a solution with a smaller
 starting room number.
   You can assume that room numbers will start from 1 and end at N.

   Hint: Find a continuous subsequence whose sum will be exactly equal to K.

   Example 1:

   Input:
   10 15 -> N =10, K = 15
   5 3 7 14 18 1 18 4 8 3 -> Number of gold coins in each room.
   Output:
   1 3
   Explanation: There are ten rooms in the house.
 You want to have the Total sum of gold coins in a continuous sequence of rooms to be
 15 There are two solutions to this i.e. [1, 3] and [8, 10] then the solution with a smaller starting room
 number will be printed hence [1, 3] is output.
 Input:
5 10
2 4 6 8 10

 */
import java.util.Scanner ;
public class QUES_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ;
        int K = sc.nextInt() ;
        int[] arr = new int[N] ;
        for (int i = 0 ; i< N ; i ++)
            arr[i] = sc.nextInt() ;

        solution_Ques_9 obj = new solution_Ques_9() ;
        System.out.println(obj.getRange(arr,N,K));
    }
}
class solution_Ques_9 {
    public String getRange(int[] arr , int N , int K){
        int s = 0 ;
        int sum = 0 ;
        for (int i = 0 ; i < N ; i ++){
            int val = arr[i] ;
            sum += val ;
            if(sum > K){
                sum -= arr[s] ;
                s ++ ;
            }
            if(sum == K) {
                return (s + 1) + " " + (i + 1);
            }
        }

        return "No such sequence have been found";
    }
}