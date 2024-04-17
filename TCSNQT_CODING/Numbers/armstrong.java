package TCSNQT_CODING.Numbers;

public class armstrong {
    public static void main(String[] args){
        Solution_Numbers_2 object = new Solution_Numbers_2() ;
        System.out.println(object.isArmstrong(353));
        System.out.println(object.isArmstrong(153));
    }
}
class Solution_Numbers_2 {
    public boolean isArmstrong(int N){
        int temp = N ;
        int sum = 0 ;
        while (temp != 0){
            int r = temp % 10 ;
            sum += (int) Math.pow( r ,  3);
            temp = temp / 10 ;
        }

        return sum == N ;
    }
}