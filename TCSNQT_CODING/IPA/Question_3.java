package TCSNQT_CODING.IPA;

import java.util.Arrays;

public class Question_3 {
    public static void main(String[] args) {
        System.out.println(ArrayChallenge(new String[]{"4","3:1","2:2","1:2","0:1"}));
        System.out.println(ArrayChallenge(new String[]{"4","1:1","2:2","1:2","0:1"}));
        System.out.println(ArrayChallenge(new String[]{"4","0:1","2:2","1:2","3:1"}));
    }
    private static String ArrayChallenge(String[] strArr){
        int N = Integer.parseInt(strArr[0]) ;
        int[][] routeMap = new int[N][2] ;
        for (int i = 0 ; i < N ; i ++){
            routeMap[i][0] = Integer.parseInt(String.valueOf(strArr[i+1].charAt(0))) ;
            routeMap[i][1] = Integer.parseInt(String.valueOf(strArr[i+1].charAt(2))) ;
        }

        for (int i = 0 ; i < N ; i ++){
            int var = routeMap[i][1] ;
            int counter = 0 ;
            if (ifPossible(routeMap,i,var,i,counter))
                return String.valueOf(i+1) ;
        }
        return "impossible" ;
    }
    private static boolean ifPossible(int[][] routeMap , int startingPoint, int var , int x , int counter){
        if (var < routeMap[x][1] && counter > 0)
            return false ;
        if (x == startingPoint && var >= 0 && counter > 0)
            return true ;
        var = var - routeMap[x][1] ;
        var = var + routeMap[x][0] ;
        x = x + 1 ;

        return ifPossible(routeMap,startingPoint,var,x%routeMap.length , counter+1) ;
    }
}
/*
Array Challenge

Have the function

ArrayChallenge (strArr) take strArr which will be an array consisting of the following elements:
    N which will be the number of gas stations in a circular route and
    each subsequent element will be the string g:c where
     g is the amount of gas in gallons at that gas station and
     c will be the amount of gallons of gas needed to get to the following gas station.

For example strArr may be:

["4","3:1","2:2","1:2","0:1"].
Your goal is to return the index of the starting gas station that will allow you to travel around the whole route once,
otherwise return the string impossible.

For the example above,
there are 4 gas stations, and your program should return the string 1 because
starting at station 1 you receive 3 gallons of gas and spend 1 getting to the next station.
Then you have 2 gallons + 2 more at the next station and you spend 2 so ,
you have 2 gallons when you get to the 3rd station, You then have 3
but you spend 2 getting to the final station, and at the final station you receive 0 gallons and
you spend your final gallon getting to your starting point.
Starting at any other gas station would make getting around the route impossible, so the answer is 1.
If there are multiple gas stations that are possible to start at,
return the smallest index (of the gas station). N will be >= 2.

Examples

Input: ["4","1:1","2:2","1:2","0:1"]

Output: impossible

Input: ["4","0:1","2:2","1:2","3:1"]

Output: 4
 */