/*
 4) Write a Java program to demonstrate static variables, methods and
 blocks. / Matrix Mul Program
 */
package Q4;

public class StaticDemo {
    // Static variable
    static int counter;

    // Static block - runs once when the class is loaded
    static {
        counter = 0;
        System.out.println("Static block executed. Counter initialized to " + counter);
    }

    // Static method
    public static void incrementCounter() {
        counter++;
        System.out.println("Counter incremented. Current value: " + counter);
    }

    // Constructor
    public StaticDemo() {
        System.out.println("Constructor called.");
        incrementCounter();
    }

    public static void main(String[] args) {
        System.out.println("Creating first instance of StaticDemo:");
        StaticDemo obj1 = new StaticDemo();

        System.out.println("Creating second instance of StaticDemo:");
        StaticDemo obj2 = new StaticDemo();

        System.out.println("Final value of counter: " + StaticDemo.counter);
    }
}
