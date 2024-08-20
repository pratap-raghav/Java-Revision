import java.util.Scanner;

public class isNoPrime {
    static boolean isNumPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number- ");
        int num = sc.nextInt();
        System.out.println("Status- "+isNumPrime(num));
        sc.close();
    }
}
