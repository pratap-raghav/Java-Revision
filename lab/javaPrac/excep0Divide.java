import java.util.Scanner;

public class excep0Divide {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter numerator: ");
        int n = s.nextInt();
        System.out.print("Enter denominator: ");
        int d = s.nextInt();
        
        try {
            System.out.println("Result: " + (n / d));
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        }
        s.close();
    }
}
