package TCSNQT_CODING.StringMisscleneous;

import java.util.HashMap;
import java.util.Map;

public class QUES_6 {
    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC" , "ABC"));
    }
    // minimum window substring
    public static String minWindow(String s, String t) {
        int start = 0 ;
        int end = 0 ;
        int minSize = Integer.MAX_VALUE ;
        Map<Character , Integer> need = new HashMap<>() ;

        for (int i = 0 ; i < t.length() ; i ++){
            char c = t.charAt(i) ;
            need.put(c , need.getOrDefault(c , 0) + 1) ;
        }

        int needCount = need.size() ;

        for (int i = 0 ; i < s.length() ; i ++){
            char c = s.charAt(i) ;
            if (need.containsKey(c)){
                need.put(c , need.get(c) - 1) ;
                if (need.get(c) == 0)
                    needCount -- ;
            }

            while (end <= i && needCount == 0){
                char ch = s.charAt(end) ;
                int minRange = i - end + 1 ;
                if (minRange < minSize){
                    minSize = minRange ;
                    start = end ;
                }

                if (need.containsKey(ch)){
                    need.put(ch , need.get(ch) + 1) ;
                    if (need.get(ch) > 0)
                        needCount ++ ;
                }
                end ++ ;
            }
        }

        return (minSize == Integer.MAX_VALUE) ? "" : s.substring(start , start + minSize) ;
    }
}
