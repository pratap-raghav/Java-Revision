import java.util.Scanner;

public class d2b {
    static long convert(long num) {
        long power = 0;
        long value = 0;
        while (num != 0) {
            long temp = num % 2;
            num /= 2;
            value += temp * Math.pow(10, power);
            power++;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number- ");
        long num = sc.nextLong();
        System.out.println("Decimal to Binary - " + convert(num));
        sc.close();
    }
}
