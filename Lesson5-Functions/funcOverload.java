import java.util.Scanner;

public class funcOverload {
    static float add(int a, int b) {
        return a + b;
    }

    static float add(int a, int b, int c) {
        return a + b + c;
    }

    static float add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();
        System.out.print("b = ");
        int b = sc.nextInt();
        System.out.print("c = ");
        int c = sc.nextInt();
        System.out.print("d = ");
        int d = sc.nextInt();
        System.out.println("a + b = " + add(a, b));
        System.out.println("a + b + c = " + add(a, b, c));
        System.out.println("a + b + c + d = " + add(a, b, c, d));
        sc.close();
    }
}
