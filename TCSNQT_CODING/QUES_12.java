package TCSNQT_CODING;

import java.util.Arrays;
import java.util.Scanner;

public class QUES_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int N = sc.nextInt() ;
        String s1 = sc.next() ;
        String s2 = sc.next() ;
        System.out.println(solution_Ques_12.getMaxCount(s1,s2));
    }
}
class solution_Ques_12 {
    public static int getMaxCount(String s1 , String s2){
        int count = 0 ;
        int N = s1.length() ;
        char[] s1ch = s1.toCharArray() ;
        char[] s2ch = s2.toCharArray() ;

        for (int i = 0 ; i < N ; i ++){
            if(s1ch[i] != s2ch[i]){
                if(i < N - 1 && s1ch[i+1] != s2ch[i+1]){
                    char temp = s1ch[i+1] ;
                    s1ch[i+1] = s1ch[i] ;
                    s1ch[i] = temp ;
                    count ++ ;
                }else
                    count++ ;
            }
        }
        return count ;
    }
}