package TCSNQT_CODING.Numbers;

public class factorial {
    public static void main(String[] args) {
        Solution_Numbers_6 object = new Solution_Numbers_6() ;
        System.out.println(object.factRecursive(5));
        System.out.println(object.factIterative(5));
        System.out.println(object.factRecursive(4));
        System.out.println(object.factIterative(4));
        System.out.println(object.factRecursive(6));
        System.out.println(object.factIterative(6));
    }
}
class Solution_Numbers_6 {
    public int factRecursive(int N){
        if(N == 0)
            return 1 ;
        return N*factRecursive(N-1);
    }

    /**
     * 5!
     * 5 * 4 * 3 * 2 * 1
     *  = (5+5+5+5) * 3 * 2 * 1
     *  = (20 + 20 + 20) * 2 * 1
     *  = (60 + 60) * 1
     *  = 120
     * @param N
     * @return
     */
    public int factIterative(int N){
        int sum = N ;
        for (int i = N - 1 ; i >= 1 ; i --){
            int temp = 0 ;
            for (int j = 0 ; j < i ; j ++){
                temp += sum ;
            }
            sum = temp ;
        }

        return sum ;
    }
}