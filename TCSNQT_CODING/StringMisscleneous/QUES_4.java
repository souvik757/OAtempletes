package TCSNQT_CODING.StringMisscleneous;

public class QUES_4 {
    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
    public static String reverseWords(String s){
        char[] ch = s.toCharArray() ;
        int spaceIndex = -1 ;
        int startSwapping = 0 ;
        int endSwapping = 0 ;
        for (int i = 0 ; i < s.length() ; i ++){
            if (ch[i] == ' ' || i == s.length() - 1){
                startSwapping = spaceIndex + 1 ;
                endSwapping = (i == s.length() - 1) ? i : i - 1 ;
                while (startSwapping < endSwapping){
                    char temp = ch[startSwapping] ;
                    ch[startSwapping] = ch[endSwapping] ;
                    ch[endSwapping] = temp ;
                    startSwapping ++ ;
                    endSwapping -- ;
                }

                spaceIndex = i ;
            }
        }

        return new String(ch) ;
    }
}
