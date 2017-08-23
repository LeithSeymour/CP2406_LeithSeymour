import javax.swing.*;
import java.util.Arrays;

public class AscendingDescending {
    public static void main(String[] args) {
        int one, two, three, four;
        String str, output;

        str = JOptionPane.showInputDialog(null, "Enter an integer");
        one = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        two = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        three = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null, "Enter an integer");
        four = Integer.parseInt(str);

        int[] inputArray = {one, two, three, four};

        System.out.println(inputArray[0]);
        System.out.println(inputArray[1]);
        System.out.println(inputArray[2]);
        System.out.println(inputArray[3]);

        Arrays.sort(inputArray);
        System.out.print(Arrays.toString(inputArray));
    }
}
