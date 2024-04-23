package TCSNQT_CODING.StringMisscleneous;

import java.util.HashSet;
import java.util.Set;

public class QUES_3 {
    public static void main(String[] args) {

    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = Integer.MIN_VALUE ;
        int index = 0 ;
        int fwdIndex = 0 ;

        Set<Character> unique = new HashSet<>() ;

        while (fwdIndex < s.length()){
            if(!unique.contains(s.charAt(fwdIndex))){
                unique.add(s.charAt(fwdIndex)) ;
                fwdIndex ++ ;
                maxLength = Math.max(maxLength , unique.size()) ;
            }else {
                unique.remove(s.charAt(index)) ;
                index ++ ;
            }
        }

        return (maxLength == Integer.MIN_VALUE) ? 0 : maxLength ;
    }
}
