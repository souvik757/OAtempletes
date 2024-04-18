package TCSNQT_CODING.NumberSystem;

public class binaryConversion {
    public static void main(String[] args) {
        Solution_NumberSystem_1 object = new Solution_NumberSystem_1() ;
        String binaryString = "1100110" ;
        System.out.println(object.toDecimal(binaryString));
        System.out.println(object.toOctal(binaryString));
    }
}
class Solution_NumberSystem_1 {
    public int toDecimal(String bin){
        int n = bin.length() ;
        int sum = 0 ;
        int index = 0 ;
        char[] binArr = bin.toCharArray() ;
        for (int i = n - 1 ; i >= 0 ; i --){
            int digit = binArr[i] - '0' ;
            sum = (int) (sum + (digit * Math.pow(2 , index)));
            index ++ ;
        }

        return sum ;
    }
    public int toOctal(String bin){
        String binCopy = bin ;
        int n = binCopy.length() ;
        if (n % 3 == 1)
            binCopy = "00" + binCopy ;
        else if (n % 3 == 2)
            binCopy = "0" + binCopy ;
        int N = binCopy.length() ;
        String answerString = "" ;
        char[] binArr = binCopy.toCharArray() ;
        for (int i = 0 ; i < N ; i += 3){
            int temp = (4 * (binArr[i] - '0')) + (2 * (binArr[i+1] - '0')) + ((binArr[i + 2] - '0')) ;
            answerString = answerString +  String.valueOf(temp) ;
        }

        return Integer.parseInt(answerString.trim()) ;
    }
}