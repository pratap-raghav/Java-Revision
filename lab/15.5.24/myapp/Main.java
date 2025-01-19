package myapp;

import myapp.operations.AdvancedCalc;

public class Main {
    public static void main(String[] args) {
        AdvancedCalc calc = new AdvancedCalc();
        
        int a = 10;
        int b = 5;
        int c = 0;

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.sub(a, b));
        System.out.println("Multiplication: " + calc.mul(a, b));
        
        try {
            System.out.println("Division: " + calc.div(a, b));
            System.out.println("Division by zero: " + calc.div(a, c));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
