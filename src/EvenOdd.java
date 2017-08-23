import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number ");
        int choice = input.nextInt();
        if (choice % 2 > 0)
            System.out.println("Your Number is Odd");
        else
            System.out.println("Your Number is Even");


    }
}
