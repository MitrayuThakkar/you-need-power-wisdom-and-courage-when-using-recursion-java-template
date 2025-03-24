// TriangleNumberCalculator.java
package org.example;

public class TriangleNumberCalculator {

    // Recursive method to calculate the nth triangular number
    public int value(int n) {
        if (n == 1) {
            return 1;
        }
        return n + value(n - 1);
    }

    // Method to add the nth and mth triangular numbers
    public int add(int n, int m) {
        return value(n) + value(m);
    }

    // Method to subtract the nth and mth triangular numbers
    public int subtract(int n, int m) {
        return value(n) - value(m);
    }

    // Method to multiply the nth and mth triangular numbers (extra credit)
    public int multiply(int n, int m) {
        return value(n) * value(m);
    }

    // Method to divide the nth and mth triangular numbers (extra credit)
    public double divide(int n, int m) {
        if (value(m) == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return (double) value(n) / value(m);
    }

    // Method to return a sequence of triangular numbers up to the nth
    public String sequence(int n) {
        StringBuilder sequence = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sequence.append(value(i));
            if (i < n) {
                sequence.append(", ");
            }
        }
        return sequence.toString();
    }
}
