package TCSNQT_CODING.StringMisscleneous;

public class QUES_5 {
    public static void main(String[] args) {

    }
    public static String longestCommonPrefix(String[] strs){
        if(strs.length == 0)
            return "" ;
        String subStr = strs[0] ;

        for (int i = 0 ; i < strs.length ; i ++) {
            String s = strs[i] ;
            while (s.indexOf(subStr) != 0) {
                subStr = subStr.substring(0 , subStr.length() - 1) ;
                if (subStr.isEmpty())
                    return  "" ;
            }
        }

        return subStr ;
    }
}
