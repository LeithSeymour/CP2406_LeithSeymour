package Prac3;// This application gets a user's name and displays a greeting
import java.util.Scanner;

public class DebugThree3Fixed
{
   public static void main(String args[])
   {
      displayGreeting(getName());
   }
   private static String getName()
   {
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name");
      name = input.next();
      return name;
   }
   private static void displayGreeting(String name)
   {
      System.out.println("Hello, " + name + "!");
   }
}
