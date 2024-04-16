package TCSNQT_CODING.Numbers;

import java.util.HashMap;
import java.util.Map;

public class findWithinRange {
    public static void main(String[] args) {
        Solution_Numbers_1 object = new Solution_Numbers_1() ;
        object.palindromeInRange(11 , 100) ;
        object.uniqueDigitInRange(11 , 100) ;
        object.primeInRange(11 , 100);
        object.compositeInRange(11 , 100);
    }
}
class Solution_Numbers_1 {
    private boolean isPalindrome(int n){
        int temp = n ;
        StringBuilder reverseNumber = new StringBuilder() ;
        while (temp != 0){
            int R = temp % 10 ;
            temp = temp / 10 ;
            reverseNumber.append(R) ;
        }
        int numberReverse = Integer.parseInt(String.valueOf(reverseNumber)) ;
        return numberReverse == n ;
    }
    public void palindromeInRange(int s , int e){
        for (int i = s ; i <= e ; i ++){
            if (isPalindrome(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    private boolean hasUniqueDigit(int n){
        Map<Integer , Boolean> digitMap = new HashMap<>() ;
        for (int i = 0 ; i < 10 ; i ++)
            digitMap.put(i , false) ;
        int temp = n ;
        while (temp != 0){
            int R = temp % 10 ;
            temp = temp / 10 ;
            if(!digitMap.get(R))
                digitMap.put(R , true) ;
            else
                return false ;
        }
        return true ;
    }
    public void uniqueDigitInRange(int s , int e){
        for (int i = s ; i <= e ; i ++){
            if (hasUniqueDigit(i))
                System.out.print(i+",");
        }
        System.out.println();
    }
    private boolean isPrime(int n){
        if(n <= 1)
            return false ;
        int m = n/2 ;
        for (int i = 2 ; i <= m ; i ++){
            if(n % i == 0)
                return false ;
        }
        return true ;
    }
    public void primeInRange(int s , int e){
        for (int  i = s ; i <= e ; i ++){
            if (isPrime(i))
                System.out.print(i+",") ;
        }
        System.out.println();
    }
    private boolean isComposite(int n){
        if(n <= 1) return false ;
        if(n <= 3) return false ;
        if(n % 2 == 0 || n % 3 == 0) return true ;
        for (int i = 5 ; i * i <= n ; i += 6){
            if(n % i == 0 || n % (i+2) == 0)
                return true ;
        }
        return false ;
    }
    public void compositeInRange(int s , int e){
        for (int i = s; i <= e ; i ++){
            if (isComposite(i))
                System.out.print(i+",");
        }
        System.out.println();
    }
}