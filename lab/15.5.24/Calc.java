public class Calc {

    private int n1;
    private int n2;

    public Calc(int num1, int num2) {
        this.n1 = num1;
        this.n2 = num2;
    }

    public int add() {
        return n1 + n2;
    }

    public int sub() {
        return n1 - n2;
    }

    public int mul() {
        return n1 * n2;
    }

    public int div() {
        if (n2 != 0) {
            return n1 / n2;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Calc calc = new Calc(10, 5);

        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.sub());
        System.out.println("Multiplication: " + calc.mul());
        System.out.println("Division: " + calc.div());
    }
}
