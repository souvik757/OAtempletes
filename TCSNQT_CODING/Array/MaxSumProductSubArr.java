package TCSNQT_CODING.Array;

public class MaxSumProductSubArr {
    public static void main(String[] args) {
        Solution_Arr_3 object = new Solution_Arr_3() ;
        System.out.println(object.maxSumAubArr(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(object.maxProductSubArr(new int[]{2,3,-2,4}));
        System.out.println(object.maxSumCircularSubArr(new int[]{1,-2,3,-2}));
    }
}
class Solution_Arr_3 {
    public int maxSumAubArr(int[] num){
        int sum = 0 ;
        int max = num[0] ;
        for (int val : num){
            sum += val ;
            max = Math.max(max , sum) ;
            if(sum < 0)
                sum = 0 ;
        }
        return max ;
    }
    public int maxSumCircularSubArr(int[] num){
        // 1 . find kadane sum1
        // 2 . find total sumT & revert sign of array elements
        // 3 . find kadane sum2 = 0 - sum2
        // 4 . (sum2 == sumT) -> sum1
        // 5 . max(sum1 , sumT-sum2)
        int sum1 = maxSumAubArr(num) ;
        int sumT = 0 ;
        for (int i = 0 ; i < num.length ; i ++){
            sumT += num[i] ;
            num[i] = -num[i] ;
        }
        int sum2 = -maxSumAubArr(num) ;
        if(sum2 == sumT)
            return sum1 ;
        int circularSum = sumT - sum2 ;
        return Math.max(sum1 , circularSum) ;
    }
    public int maxProductSubArr(int[] num){
        int product = 1 ;
        int maxProduct = Integer.MIN_VALUE ;
        for (int i = 0 ; i < num.length ; i ++){
            product = product * num[i] ;
            maxProduct = Math.max(maxProduct , product) ;
            if(product == 0)
                product = 1 ;
        }
        product = 1 ;
        for (int i = num.length - 1 ; i >= 0 ; i --){
            product = product * num[i] ;
            maxProduct = Math.max(maxProduct , product) ;
            if(product == 0)
                product = 1 ;
        }

        return maxProduct ;
    }
}