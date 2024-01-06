package TCSNQT_CODING;

/**
 * A party has been organised on a cruise. The party is organised for a limited time(T).
 * The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is
 * represented as elements of the array.
 * The task is to find the maximum number of guests present on the cruise at any given instance within T hours.
 */

import java.util.Scanner;

/**
 * Input:
    5 ---> Value of T
    [7,0,5,1,3] ---> E[], element of E[0] to E[N-1], where input each element is separated by new line
    [1,2,1,3,4] -----> L[],element of L[0] to L[N-1], where input each element is separated by new line
 * Output:
    8 -----> Maximum number of guests on cruise at an instance
 */

public class QUES_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int T = scanner.nextInt() ;
        int[] E = new int[T] ;
        int[] L = new int[T] ;
        for (int i = 0 ; i < T ; i ++)
            E[i] = scanner.nextInt() ;
        for (int i = 0 ; i < T ; i ++)
            L[i] = scanner.nextInt() ;
        System.out.println(solution_Ques_2.maxPeople(T,E,L)) ;
    }
}
class solution_Ques_2 {
    public static int maxPeople(int T, int[] E , int[] L){
        int maxPeople = Integer.MIN_VALUE ;
        int lastTotal = 0 ;
        for (int i = 0 ; i < T ; i ++){
            lastTotal += E[i] ;
            maxPeople = Math.max(maxPeople , lastTotal - L[i]) ;
            lastTotal -= L[i] ;
        }

        return (maxPeople == Integer.MIN_VALUE) ? 0 : maxPeople ;
    }
}
