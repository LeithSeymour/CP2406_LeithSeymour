package Prac3;

public class Percentages {
    public static void main(String[] args) {
        double PercentageOne = 5.0;
        double PercentageTwo = 10.0;

        computePercent(PercentageOne, PercentageTwo);
    }

    private static void computePercent(double percentageOne, double percentageTwo) {
        double percentageFirstOfSecond = percentageOne / percentageTwo * 100.00;
        System.out.printf("%s is %s%% of %s", percentageOne, percentageFirstOfSecond, percentageTwo);
    }

}
