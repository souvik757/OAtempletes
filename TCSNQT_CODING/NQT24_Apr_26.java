package TCSNQT_CODING;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NQT24_Apr_26 {
    public static void main(String[] args) {
        int a = new Scanner(System.in).nextInt() ;
        int b = new Scanner(System.in).nextInt() ;
        MyCLass1 myCLass1 = new MyCLass1(a , b) ;
        myCLass1.getSumOfCubes() ;
        int n = new Scanner(System.in).nextInt() ;
        MyCLass2 myCLass2 = new MyCLass2(n) ;
        myCLass2.getStatistics();
    }
}
class MyCLass1 {
    private int a ;
    private int b ;
    public MyCLass1(int a , int b){
        this.a = a ;
        this.b = b ;
    }
    public void getSumOfCubes(){
        int sum = 0 ;
        for (int i = a ; i <= b ; i ++)
            sum += (int) Math.pow(i , 3) ;
        System.out.println(sum);
    }

}
class MyCLass2 {
    private int NoOfTransactions ;
    private transaction[] transactions ;

    public MyCLass2(int noOfTransactions) {
        NoOfTransactions = noOfTransactions;
        this.transactions = new transaction[noOfTransactions] ;
        for (int i = 0 ; i < noOfTransactions ; i ++){
            String name = new Scanner(System.in).next() ;
            double pricePerUnit = new Scanner(System.in).nextDouble() ;
            int noOfUnit = new Scanner(System.in).nextInt() ;
            this.transactions[i] = new transaction(name , pricePerUnit , noOfUnit) ;
        }
    }

    public void getStatistics(){
        double totalSales = (float) 0.0 ;
        double avgSales ;
        String maxSales = "" ;
        Map<String,Integer> countMap = new HashMap<>() ;
        for (transaction t : transactions){
            totalSales = totalSales + (t.getPriceOfUnit() * (double) t.getUnitSold()) ;
            countMap.put(t.getName() ,
                    countMap.getOrDefault(t.getName() , 0) + t.getUnitSold()) ;
        }
        avgSales = totalSales / (double) NoOfTransactions ;

        System.out.printf("Total Sales : %.2f Average Sales : %.2f",totalSales,avgSales);
        int maxSoldUnit = Integer.MIN_VALUE ;
        for (Map.Entry<String,Integer> entry : countMap.entrySet()){
            if (entry.getValue() > maxSoldUnit){
                maxSoldUnit = entry.getValue() ;
                maxSales = entry.getKey() ;
            }
        }
        System.out.println(" Maximum sold unit : "+maxSales) ;
    }
}
class transaction {
    private String name ;
    private double priceOfUnit ;
    private int unitSold ;

    public transaction(String name, double priceOfUnit, int unitSold) {
        this.name = name;
        this.priceOfUnit = priceOfUnit;
        this.unitSold = unitSold;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPriceOfUnit() {
        return priceOfUnit;
    }

    public void setPriceOfUnit(double priceOfUnit) {
        this.priceOfUnit = priceOfUnit;
    }

    public int getUnitSold() {
        return unitSold;
    }

    public void setUnitSold(int unitSold) {
        this.unitSold = unitSold;
    }
}