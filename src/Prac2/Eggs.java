package Prac2;

import java.util.Scanner;

public class Eggs {
    public static void main(String[] args) {
        double Cost_Dozen_Eggs = 3.25;
        double Cost_Single_Eggs = .45;

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter amount of eggs");
        String Eggs_Desired = user_input.next();
        int Amount_of_Singles = Integer.parseInt(Eggs_Desired) % 12;
        int Amount_of_Dozens = (Integer.parseInt(Eggs_Desired) - Amount_of_Singles) / 12;

        System.out.println("You ordered " + (Eggs_Desired) + " eggs, that's " +
                + Amount_of_Dozens + " Dozens at $" + (Cost_Dozen_Eggs)
                + " and " + Amount_of_Singles + " loose egg/s at $" + (Cost_Single_Eggs) +
                " for a total of $" + ((Amount_of_Dozens * Cost_Dozen_Eggs) + (Amount_of_Singles * Cost_Single_Eggs)));
    }
}
