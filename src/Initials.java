import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter first Initial");
        String first_initial = user_input.next();
        System.out.println("Enter second Initial");
        String second_initial = user_input.next();
        System.out.println("Enter third Initial");
        String third_initial = user_input.next();
        System.out.println(first_initial + '.' + second_initial + '.' + third_initial);
    }

}
