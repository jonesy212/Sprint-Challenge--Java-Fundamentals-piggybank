package Piggybank;

import java.util.*;

import java.text.DecimalFormat;



public class Main{
    
    //method
    public static void CountCoins (ArrayList<CountCoins> coins)
    {
        
        DecimalFormat fp = new DecimalFormat("$###,##0.00");
        for(CountCoins a : coins)
    
            {
                System.out.println( a.setName() + " " +  fp.format(a.getValue()) + " " + a.getQuantity());
            }
    
    }

    public static void main(String[] args)
    {
    //create coin collection
    ArrayList<CountCoins> coinsArrayList = new ArrayList<CountCoins>();
    coinsArrayList.add(new Quarter(1));
    coinsArrayList.add(new Dime(7));
    coinsArrayList.add(new Dime(1));
    coinsArrayList.add(new Dollar(5));
    coinsArrayList.add(new Nickel(3));
    coinsArrayList.add(new Penny(10));
    coinsArrayList.add(new Dollar(1));

    System.out.println();
    System.out.println("Your piggy bank holds ");
    System.out.println();
    CountCoins(coinsArrayList);
    System.out.println();
    

    //for loop make sure to call the ArrayList
    double sum = 0;

    for( CountCoins a : coinsArrayList)
        {
          sum= sum + ( a.getValue() * a.getQuantity());
        }
    System.out.println("The total of is " + sum);
    System.out.println();
   
    // System.out.println("The piggy bank hold a total ");
    // coinsArrayList.sort((a1, a2) -> a2.getQuantity() - a1.getQuantity());
    // System.out.println(coinsArrayList.toString());
    }
}