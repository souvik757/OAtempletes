package TCSNQT_CODING.NumberSystem;

public class octalConversion {
    public static void main(String[] args) {
        Solution_NumberSystem_3 obj = new Solution_NumberSystem_3() ;
        System.out.println(obj.toBinary(345));
        System.out.println(obj.toDecimal(345));
    }
}
class Solution_NumberSystem_3 {
    public String toBinary(int oct){
        Solution_NumberSystem_2 object = new Solution_NumberSystem_2() ;
        String answer = "" ;

        char[] octArr = String.valueOf(oct).toCharArray() ;
        for (int i = 0 ; i < octArr.length ; i ++){
            String bin = object.toBinary(octArr[i] - '0') ;
            answer = answer + bin ;
        }

        return answer ;
    }
    public int toDecimal(int oct){
        char[] octArr = String.valueOf(oct).toCharArray() ;
        int index = 0 ;
        int sum = 0 ;
        for (int i = octArr.length - 1 ; i >= 0 ; i --){
            int digit = octArr[i] - '0' ;
            sum += (int) (digit * Math.pow(8 , index));
            index ++ ;
        }

        return sum ;
    }
}