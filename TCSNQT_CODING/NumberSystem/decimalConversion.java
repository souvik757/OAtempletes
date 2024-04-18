package TCSNQT_CODING.NumberSystem;

public class decimalConversion {
    public static void main(String[] args) {
        Solution_NumberSystem_2 object = new Solution_NumberSystem_2() ;
        System.out.println(object.toBinary(28));
        System.out.println(object.toOctal(136));
    }
}
class Solution_NumberSystem_2 {
    public String toBinary(int dec){
        StringBuilder answer = new StringBuilder() ;
        while (dec != 1){
            int R = dec % 2 ;
            answer.append(R) ;
            dec = dec / 2 ;
        }
        answer.append(1) ;
        return answer.reverse().toString() ;
    }
    public String toOctal(int dec){
        StringBuilder answer = new StringBuilder() ;
        while (dec != 0){
            int R = dec % 8 ;
            answer.append(R) ;
            dec = dec / 8 ;
        }
        return answer.reverse().toString() ;
    }
}