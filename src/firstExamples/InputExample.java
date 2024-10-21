package firstExamples;

import java.util.*;

/**
 * This program demonstrates console input.
 * @version 1.10 2004-02-10
 * @author Cay Horstmann
 */
public class InputExample {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      // get first input
      System.out.print("What is your name? ");
      String name = scanner.nextLine();

      // get second input - demonstrate the type conversion error
      System.out.print("How old are you? ");
      int age = scanner.nextInt();

      // display output on console
      System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1));
   }
}
