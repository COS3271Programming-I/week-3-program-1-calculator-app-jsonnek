// Jonathan Sonnek
// February 3rd, 2026
// Calculator APP

import java.util.Scanner;

public class Main {
  static Scanner userinput = new Scanner(System.in);
  public static void main(String[] args) {
//  Define Variables
    double x, y;
//  Get User input for numbers
    System.out.println("Enter first number (x): ");
    x = userinput.nextDouble();
    System.out.println("Enter second number (y): ");
    y = userinput.nextDouble();
//  Get User input for operation
    System.out.println("Select operation (1-6)\n" +
            "1:Addition, 2:Multiplication, 3:Division, 4:Exponent (x^y), 5:Logarithm (log base y of x), 6:All operations: ");
    int operation = userinput.nextInt();
//  Perform operation based on user input
    if (operation == 1) {
      System.out.println("Addiiton:\n" +
              "x + y = " + (x+y));
    }
    else if (operation == 2) {
      System.out.println("Multiplication:\n" +
              " x * y = " + (x*y));
    }
    else if (operation == 3) {
      System.out.println("Division:\n" +
              "x / y = " + (x/7));
    }
    else if (operation == 4) {
      System.out.println("Exponent:\n" +
              "x^y = " + Math.pow(x, y));
    }
    else if (operation == 5) {
      System.out.println("Logarithm:\n" +
              "log base y of x = " + Math.log(x) / Math.log(y));
    }
    else if (operation == 6) {
      System.out.println("Addition:\n" +
              " x + y = " + (x+y));
      System.out.println("Multiplication:\n" +
              " x * y = " + (x*y));
      System.out.println("Division:\n" +
              "x / y = " + (x/7));
      System.out.println("Exponent:\n" +
              "x^y = " + Math.pow(x, y));
      System.out.println("Logarithm:\n" +
              "log base y of x = " + Math.log(x) / Math.log(y));
    }
    else {
      System.out.println("Invalid operation selected.");
    }


  }
}