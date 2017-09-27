package Prac3;

import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter Student Name");
        String studentName = user_input.next();
        System.out.println("Enter your grade point average");
        String GPointAverage = user_input.next();

        DisplayCreditInfo(studentName, GPointAverage);
    }

    private static void DisplayCreditInfo(String studentName, String Gpointaverage) {
        System.out.printf("Hello %s, you provided a GPA of %s which provides you with $%s worth of credit",
                studentName, Gpointaverage, Integer.parseInt(Gpointaverage) * 10);
    }
}
