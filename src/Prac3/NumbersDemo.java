package Prac3;

public class NumbersDemo {
    public static void main(String[] args) {
        int ValueOne = 5;
        int ValueTwo = 3;

        DisplayNumberTwice(ValueOne);
        DisplayNumberPlusFive(ValueOne);
        DisplayNumberedSquared(ValueOne);

        DisplayNumberTwice(ValueTwo);
        DisplayNumberPlusFive(ValueTwo);
        DisplayNumberedSquared(ValueTwo);

    }

    private static void DisplayNumberedSquared(int UserValue) {
        int NewValue = (int)Math.pow(UserValue, 2);
        System.out.println(NewValue);
    }

    private static void DisplayNumberPlusFive(int UserValue) {
        int NewValue;
        NewValue = UserValue + 5;
        System.out.println(NewValue);
    }

    private static void DisplayNumberTwice(int UserValue) {
        int NewValue;
         NewValue = UserValue * 2;
         System.out.println(NewValue);
    }

}
