package TCSNQT_CODING.Numbers;

public class leapYear {
    public static void main(String[] args) {
        Solution_Numbers_5 object = new Solution_Numbers_5() ;
        System.out.println(object.isLeapYear(2016));
        System.out.println(object.isLeapYear(1915));
        System.out.println(object.isLeapYear(1996));
        System.out.println(object.isLeapYear(2002));
    }
}
class Solution_Numbers_5{
    public boolean isLeapYear(int yyyy){
        if(yyyy % 400 == 0)
            return true ;
        if(yyyy % 100 == 0)
            return false ;
        if(yyyy % 4 == 0 )
            return true ;
        return false ;
    }
}