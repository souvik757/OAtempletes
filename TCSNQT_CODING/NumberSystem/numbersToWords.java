package TCSNQT_CODING.NumberSystem;

public class numbersToWords {
    public static void main(String[] args) {
        Solution_NumberSystem_4 obj = new Solution_NumberSystem_4() ;
        System.out.println(obj.convertNumberToWord(123210));
    }
}
class Solution_NumberSystem_4 {
    public String convertNumberToWord(int n) {
        long limit = 1000000000000L, curr_hun, t = 0;

        if (n == 0)
            return ("Zero");

        String multiplier[] = { "", "Trillion", "Billion",
                "Million", "Thousand" };

        String first_twenty[] = {
                "",	 "One",	 "Two",	 "Three",
                "Four", "Five",	 "Six",	 "Seven",
                "Eight", "Nine",	 "Ten",	 "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen",
                "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String tens[] = { "",	 "Twenty", "Thirty",
                "Forty", "Fifty", "Sixty",
                "Seventy", "Eighty", "Ninety" };

        if (n < 20L)
            return (first_twenty[(int)n]);
        String answer = "";
        for (long i = n; i > 0; i %= limit, limit /= 1000) {
            curr_hun = i / limit;

            while (curr_hun == 0) {
                i %= limit;
                limit /= 1000;
                curr_hun = i / limit;
                ++t;
            }

            if (curr_hun > 99)
                answer += (first_twenty[(int)curr_hun / 100]
                        + " Hundred ");

            curr_hun = curr_hun % 100;

            if (curr_hun > 0 && curr_hun < 20)
                answer += (first_twenty[(int)curr_hun] + " ");

            else if (curr_hun % 10 == 0 && curr_hun != 0)
                answer += (tens[(int)curr_hun / 10 - 1] + " ");

            else if (curr_hun > 20 && curr_hun < 100)
                answer += (tens[(int)curr_hun / 10 - 1] + " " + first_twenty[(int)curr_hun % 10] + " ");

            if (t < 4)
                answer += (multiplier[(int)++t] + " ");
        }
        return answer;
    }
}