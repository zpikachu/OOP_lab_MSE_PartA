/*
  6) Write a program to demonstrate a simple calculator using the
 diamond problem in Java.
 */
package Q6;

import java.util.Scanner;

public class DemoCalculator {
 public static void main(String[] args) {
     Calculator calculator = new Calculator();
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter first number: ");
     int num1 = scanner.nextInt();

     System.out.print("Enter second number: ");
     int num2 = scanner.nextInt();

     // Perform addition and subtraction using the calculator
     int sum = calculator.add(num1, num2);
     int difference = calculator.subtract(num1, num2);

     System.out.println("Sum: " + sum);
     System.out.println("Difference: " + difference);

     scanner.close();
 }
}

