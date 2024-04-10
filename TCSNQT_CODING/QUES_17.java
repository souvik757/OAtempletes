package TCSNQT_CODING;

public class QUES_17 {
    public static void main(String[] args) {
        Solution_Ques_17 obj = new Solution_Ques_17() ;
        obj.getPalindromeSegment("aaaaa");
        obj.getPalindromeSegment("nayannamantenet");
    }
}
class Solution_Ques_17 {
    private boolean isPalindrome(String str){
        StringBuilder stringBuilder = new StringBuilder(str) ;
        return str.equals(String.valueOf(stringBuilder.reverse())) ;
    }
    public void getPalindromeSegment(String str){
        boolean flag = false ;
        int len = str.length() ;
        for (int i = 1 ; i < len ; i ++){
            String a = str.substring(0 , i) ;
            if (isPalindrome(a)){
                for (int j = 1 ; j < len-i ; j ++){
                    String b = str.substring(i , i+j) ;
                    String c = str.substring(i+j , len) ;
                    if(isPalindrome(b) && isPalindrome(c)){
                        System.out.println(a+"\n"+b+"\n"+c);
                        flag = true ;
                        break;
                    }
                }
            }
            if(flag)
                break;
        }
        if (!flag)
            System.out.println("impossible");
    }
}