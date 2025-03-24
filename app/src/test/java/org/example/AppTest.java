// AppTest.java
package org.example;

public class AppTest {

    public static void main(String[] args) {
        // Create an instance of the TriangleNumberCalculator
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();

        // Test the value method
        System.out.println("value(1): " + calculator.value(1)); // Expected: 1
        System.out.println("value(2): " + calculator.value(2)); // Expected: 3
        System.out.println("value(4): " + calculator.value(4)); // Expected: 10

        // Test the add method
        System.out.println("add(1, 1): " + calculator.add(1, 1)); // Expected: 2
        System.out.println("add(2, 3): " + calculator.add(2, 3)); // Expected: 9
        System.out.println("add(4, 2): " + calculator.add(4, 2)); // Expected: 13

        // Test the subtract method
        System.out.println("subtract(1, 1): " + calculator.subtract(1, 1)); // Expected: 0
        System.out.println("subtract(2, 3): " + calculator.subtract(2, 3)); // Expected: -3
        System.out.println("subtract(4, 2): " + calculator.subtract(4, 2)); // Expected: 7

        // Test the multiply method (extra credit)
        System.out.println("multiply(2, 3): " + calculator.multiply(2, 3)); // Expected: 18

        // Test the divide method (extra credit)
        System.out.println("divide(4, 2): " + calculator.divide(4, 2)); // Expected: 1.4285714285714286

        // Test the sequence method (extra credit)
        System.out.println("sequence(5): " + calculator.sequence(5)); // Expected: 1, 3, 6, 10, 15
    }
}
