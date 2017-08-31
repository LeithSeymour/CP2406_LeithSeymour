import java.util.Arrays;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int TenInts[] = {4, 20, 3, 5, 7, 3, 2, 21, 16, 13};
        DisplayInts(TenInts);
        DisplayReversed(TenInts);
        DisplaySum(TenInts);
        DisplayLessThan(TenInts);
        DisplayHigherThanCalcAvg(TenInts);
    }

    private static void DisplayHigherThanCalcAvg(int[] input) {
        int sum = 0;
        for (int anInput : input) {
            sum += anInput;
        }
        int average = sum / input.length;
        int IndexCounter = 0;
        int[] NewArray = new int[input.length];
        for (int anInput : input) {
            if (anInput > average)
                NewArray[IndexCounter] = anInput;
            IndexCounter++;
        }
        System.out.println("Values Higher than " + average + " are\n" + Arrays.toString(NewArray));
    }

    private static void DisplayLessThan(int[] input) {
        int i;
        int Limiter = 15;
        int IndexCounter = 0;
        int[] NewArray = new int[input.length];
        for (i = 0; i < input.length; i++) {
            if (input[i] < Limiter)
                NewArray[IndexCounter] = input[i];
            IndexCounter++;
        }
        System.out.println("Values less than " + Limiter + " are\n" + Arrays.toString(NewArray));
    }

    private static void DisplaySum(int[] input) {
        int sum = 0;
        for (int anInput : input) {
            sum += anInput;
        }
        System.out.println("Sum of String is \n" + sum);
    }

    private static void DisplayReversed(int[] input) {
        int[] NewArray = new int[input.length];
        System.out.println("Reversed String");
        for (int i = 0; i < input.length; i++) {
            NewArray[i] = input[(input.length - 1) - i];
        }
        System.out.println(Arrays.toString(NewArray));
    }

    private static void DisplayInts(int[] input) {
        System.out.println("Normal String");
        System.out.println(Arrays.toString(input));
    }
}
