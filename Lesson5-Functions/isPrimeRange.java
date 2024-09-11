import java.util.Scanner;

public class isPrimeRange {
    static boolean isNumPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeRange(int num) {
        for (int i = 2; i <= num; i++) {
            if (isNumPrime(i) == true)
                System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primeRange(num);
        sc.close();
    }

}
