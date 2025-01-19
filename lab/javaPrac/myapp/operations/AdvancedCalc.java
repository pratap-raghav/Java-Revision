package myapp.operations;

public class AdvancedCalc extends Calc {
    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }
}
