import java.util.* ;
public class RUNDEBUG {
    public static void main(String[] args)
    {
        // 7,1,5,3,6,4
        // [0,1,0,2,1,0,0,1,1,2]
        // 0 - 4
        // 1 - 4
        // 2 - 2
        int[] num = {0,1,0,2,1,0,0,1,1,2} ;
        System.out.println(Arrays.toString(_0_1_2_sort(num)));
    }
    public static int[] _0_1_2_sort(int[] num){

        Map<Integer,Integer> map = new HashMap<>() ;
        for (int i = 0 ; i < num.length ; i ++){
            map.put(num[i] , map.getOrDefault(num[i] , 0) + 1) ;
        }
        int numberOfZero = 0 ;
        int numberOfOne = 0 ;
        int numberOfTwo = 0 ;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getKey() == 0)
                numberOfZero = entry.getValue() ;
            if(entry.getKey() == 1)
                numberOfOne = entry.getValue() ;
            if(entry.getKey() == 2)
                numberOfTwo = entry.getValue() ;
        }

        int index = 0 ;
        for (int i  = 0 ; i < numberOfZero ; i ++) {
            num[index] = 0;
            index ++ ;
        }
        for (int i  = 0 ; i < numberOfOne ; i ++) {
            num[index] = 1;
            index ++ ;
        }
        for (int i  = 0 ; i < numberOfTwo ; i ++) {
            num[index] = 2;
            index ++ ;
        }

        return num ;
    }
}



































// Java SE 7
// Java SE 8 // *
// Java SE 17 LTS features // ***
// sealed classes
abstract sealed class shape permits rectangle , circle{

}
final class rectangle extends shape{

}
final class circle extends shape{
    
}
final class audi {

}
// instanceOf

// enhanced switch

// Java SE 19 features // **
