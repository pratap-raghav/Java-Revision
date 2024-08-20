import java.util.Scanner;

public class binoCoeff {
    static int fact(int num) {
        int f = 1;

        for (int i = 1; i <= num; i++) {
            f = f * i;
        }

        return f;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        System.out.println("nCr : " + n + "C" + r + " = " + (fact(n)/(fact(r)*fact(n-r))));

    }
}
