package TCSNQT_CODING;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Given two non-negative integers n1 and n2, where n1
 * For example:
 * Suppose n1=11 and n2=15.
 * There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.
 * Example1:
 * Input:
 *     11 — Value of n1
 *     15 — value of n2
 * Output:
 *     4
 * Example 2:
 * Input:
 *     101 — value of n1
 *     200 — value of n2
 * Output:
 *     72
 */
public class QUES_16 {
    public static void main(String[] args) {
        Solution_Ques_16 obj = new Solution_Ques_16() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("n1 : ");
        int n1 = sc.nextInt() ;
        System.out.print("n2 : ");
        int n2 = sc.nextInt() ;
        System.out.println(obj.getCount(n1 , n2));
    }
}
class Solution_Ques_16 {
    private boolean hasDuplicateDigit(int n){
        boolean hasDuplicate = false ;
        Map<Integer,Boolean> uniqueCount = new HashMap<>() ;
        for (int i = 0 ; i < 10 ; i ++)
            uniqueCount.put(i , false) ;
        while (n > 0){
            int remainder = n % 10 ;
            if (uniqueCount.get(remainder)){
                hasDuplicate = true ;
                break;
            }else {
                uniqueCount.put(remainder , true) ;
            }
            n = n/10 ;
        }

        return hasDuplicate ;
    }
    public int getCount(int n1 , int n2){
        int count = 0 ;
        for (int i = n1 ; i <= n2 ; i ++){
            if(!hasDuplicateDigit(i))
                count ++ ;
        }
        return count ;
    }
}