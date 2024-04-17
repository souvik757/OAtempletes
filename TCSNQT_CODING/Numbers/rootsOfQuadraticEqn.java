package TCSNQT_CODING.Numbers;

public class rootsOfQuadraticEqn {
    public static void main(String[] args) {
        Solution_Number_7 object = new Solution_Number_7() ;
        System.out.println(object.roots(2.3 , 4 , 5.6));
    }
}
class Solution_Number_7 {
    public String roots(double a , double b , double c){
        if(a == 0)
            return "Invalid" ;
        double d = Math.pow(b,2) - 4 * a * c ;
        if (d == 0){
            double root = - b / (2 * a) ;
            return "real & same root - "+root ;
        }
        else {
            if (d < 0){
                double real = - b / (2 * a) ;
                double imaginary = Math.sqrt(-d) / (2 * a) ;

                return "imaginary & different root - \n"+real+"+"+imaginary+"i\n"+
                                                         real+"-"+imaginary+"i" ;
            }else {
                double root1 = (- b + Math.sqrt(d)) / (2*a) ;
                double root2 = (- b - Math.sqrt(d)) / (2*a) ;
                return "real & different root - "+root1+" , "+root2 ;
            }
        }
    }
}