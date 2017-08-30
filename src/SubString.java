import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        String str;
        int x;
        int length;
        int start = 0;
        int num;
        int lastSpace = -1;
        int sum = 0;
        String partStr;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");

        str = in.nextLine();
        length = str.length();
        System.out.println("Length is " + length);

        for (x = 0; x < length; ++x) {
            System.out.println("Current index is " + x);
            if (str.charAt(x) == ' ') {
                partStr = str.substring(x + lastSpace, x);
                System.out.println("Current index is blank, PartStr created is " + partStr);
            }
        }
    }
}
