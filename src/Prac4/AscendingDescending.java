package Prac4;

import javax.swing.*;
import java.util.Arrays;
import java.util.Collections;

public class AscendingDescending {
    public static void main(String[] args) {
        int one, two, three, four;
        String str;

        str = JOptionPane.showInputDialog(null, "Enter an integer");
        one = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        two = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        three = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        four = Integer.parseInt(str);

        Integer[] inputArray = {one, two, three, four};

        System.out.println(inputArray[0]);
        System.out.println(inputArray[1]);
        System.out.println(inputArray[2]);
        System.out.println(inputArray[3]);

        System.out.println("Ascending Order");
        Arrays.sort(inputArray);
        System.out.print(Arrays.toString(inputArray));

        System.out.println("\nDescending Order");
        Arrays.sort(inputArray, Collections.reverseOrder());
        System.out.print(Arrays.toString(inputArray));
    }
}
