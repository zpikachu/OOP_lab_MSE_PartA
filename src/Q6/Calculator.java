/*
  6) Write a program to demonstrate a simple calculator using the
 diamond problem in Java.
 */
// Calculator.java
package Q6;

class Calculator implements Adder, Subtractor {

    // Implementing add() from Adder interface
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    // Implementing subtract() from Subtractor interface
    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}
