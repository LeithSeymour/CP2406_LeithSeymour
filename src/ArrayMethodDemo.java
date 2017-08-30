import com.sun.org.apache.bcel.internal.generic.NEW;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        int SLength;
        int TenInts[] = {4, 20, 3, 5, 7, 3, 2, 21, 16, 13};
        SLength = TenInts.length;

        DisplayInts(TenInts);
        DisplayReversed(TenInts);
    }

    private static void DisplayReversed(int[] input) {
        int i;
        int[] NewArray = {};

        System.out.println("Reversed String");
        for (i = 0; i < input.length; ++i) {
            NewArray[i] = input[(input.length - 1) - i]
            ;
        }

        System.out.println(Arrays.toString(NewArray));
    }

    private static void DisplayInts(int[] input) {
        System.out.println("Normal String");
        System.out.println(Arrays.toString(input));
    }
}
