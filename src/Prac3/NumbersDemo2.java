package Prac3;

import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Value One");
        String Value1 = user_input.next();
        System.out.println("Enter Value Two");
        String Value2 = user_input.next();

        int ValueOne = Integer.parseInt(Value1);
        int ValueTwo = Integer.parseInt(Value2);

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
