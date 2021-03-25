package com.h2;
import java.util.Scanner;
import java.util.Map;

public class BestLoanRates {
   public final static  Map <Integer, Float> = bestRates;
    public static float main (String[] args) {


    {
        bestRates()
    }


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Name " + name);

        System.out.println("Enter the loan term (in years)");
        Integer loanTermInYears = scanner.nextInt();
        float bestRates = getRates(loanTermInYears);



        integerFloatMap = Map.of(1, 5.50f, 2, 3.45f, 3, 2.67f);



        public static getRates(loanTermInYears)
        {
            if(bestRates.containsKey(loanTermInYears)) return 0.0f;

        }
        if (bestRates == 0.0f)
        {
            System.out.println("No available rates for term: " + loanTermInYears + " years");
        }
            else
        {
                System.out.println("Best Available Rate: " + getRates(loanTermInYears) + "%");
        }
            scanner.close();
    }

}
