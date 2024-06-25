package TCSNQT_CODING;

public class Searching {
    public static void main(String[] args) {
        System.out.println(hasByLinear(new int[]{-1,0,1,2,3,4,5} , 5));
        System.out.println(hasByBinary(new int[]{-1,0,1,2,3,4,5} , 5));
    }
    private static int hasByLinear(int[] arr , int target){
        for (int i = 0 ; i < arr.length ; i ++){
            if (target == arr[i])
                return i ;
        }

        return -1 ;
    }
    private static int hasByBinary(int[] arr , int target){
        int s = 0 ;
        int l = arr.length - 1 ;

        while (s <= l){
            int mid = s + (l-s)/2 ;
            if(arr[mid] == target)
                return mid ;
            else {
                if (arr[mid] > target)
                    l -- ;
                else
                    s ++ ;
            }

        }

        return -1 ;
    }
}
