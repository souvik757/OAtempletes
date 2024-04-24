package TCSNQT_CODING.StringMisscleneous;

public class QUES_1 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(7 ,
                new int[]{4,3,5,6}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int answer = Integer.MAX_VALUE ;
        int s = 0 ;
        int sum = 0 ;

        for (int i = 0 ; i < nums.length ; i ++){
            sum += nums[i] ;
            while (sum >= target){
                answer = Math.min(answer , (i - s + 1)) ;
                sum -= nums[s] ;
                s ++ ;
            }

        }

        return (answer == Integer.MAX_VALUE) ? 0 : answer ;
    }
}