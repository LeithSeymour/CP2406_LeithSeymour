package Prac5;

import java.util.Arrays;
import java.util.Scanner;

public class TwelveInts {

    public static void main(String[] args) {
        int i;
        Scanner input = new Scanner(System.in);

        int[] twelveInts = new int[12];
        System.out.println("Enter 12 Ints");
        for (i = 0; i < twelveInts.length; i++)
            twelveInts[i] = input.nextInt();
        System.out.println(Arrays.toString(twelveInts));

        int[] reversedArray = new int[twelveInts.length];
        System.out.println("Reversed String");
        for (i = 0; i < twelveInts.length; i++) {
            reversedArray[i] = (twelveInts.length) - i;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
