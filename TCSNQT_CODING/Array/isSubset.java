package TCSNQT_CODING.Array;

import java.util.Map ;
import java.util.HashMap ;
public class isSubset {
    public static void main(String[] args) {
        Solution_Arr_5 object = new Solution_Arr_5() ;
        System.out.println(object.isSubset(new int[]{2,4,3,1,7,5,15} , new int[]{1,3,4,5,2}));
    }
}
class Solution_Arr_5 {
    public boolean isSubset(int[] A , int[] B){
        Map<Integer , Integer> digitA = new HashMap<>() ;
        for (int val : A)
            digitA.put(val , 1) ;
        for (int val : B){
            if(!digitA.containsKey(val))
                return false ;
        }

        return true ;
    }
}