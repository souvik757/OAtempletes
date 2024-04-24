package TCSNQT_CODING.StringMisscleneous;

import java.util.Arrays;

public class QUES_7 {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING" , 4));
    }
    public static String convert(String s, int numRows) {
        StringBuilder answer = new StringBuilder() ;
        int len = s.length() ;
        char[][] rawArr = new char[numRows][len] ;
        for (char[] chArr : rawArr)
            Arrays.fill(chArr , '\0');
        int row = 0 ;
        int col = 0 ;
        boolean down = true ;

        for (int i = 0 ; i < len ; i ++){
            char ch = s.charAt(i) ;
            if (down){
                if(isValid(row,col,rawArr)){
                    rawArr[row][col] = ch ;
                    if (row == numRows - 1){
                        col ++ ;
                        row -- ;
                        down = false ;
                    }else
                        row ++ ;
                }
            }else {
                if(isValid(row,col,rawArr)){
                    rawArr[row][col] = ch ;
                    if (row == 0){
                        row ++ ;
                        down = true ;
                    }else {
                        row -- ;
                        col ++ ;
                    }
                }
            }
        }

        for (char[] chArr : rawArr){
            for (char ch : chArr){
                if (ch != '\0')
                    answer.append(ch) ;
            }
        }

        return (numRows <= 1) ? s :  new String(answer) ;
    }
    private static boolean isValid(int i , int j , char[][] chArr){
        return i >= 0 && j >= 0 && i < chArr.length && j < chArr[0].length ;
    }
}