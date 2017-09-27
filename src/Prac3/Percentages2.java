package Prac3;

import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Value One");
        String Value1 = user_input.next();
        System.out.println("Enter Value Two");
        String Value2 = user_input.next();

        int PercentageOne = Integer.parseInt(Value1);
        int PercentageTwo = Integer.parseInt(Value2);

        computePercent(PercentageOne, PercentageTwo);
    }

    private static void computePercent(double percentageOne, double percentageTwo) {
        double percentageFirstOfSecond = percentageOne / percentageTwo * 100.00;
        System.out.printf("%s is %s%% of %s", percentageOne, percentageFirstOfSecond, percentageTwo);
    }

}
