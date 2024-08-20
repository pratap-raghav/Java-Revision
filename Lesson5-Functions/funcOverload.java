import java.util.Scanner;

public class funcOverload {
    static int add(int a, int b) {
        return a + b;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    static float add(float a, float b) {
        return a + b;
    }

    static float add(float a, float b, float c) {
        return a + b + c;
    }

    static float add(float a, float b, float c, float d) {
        return a + b + c + d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("int a = ");
        int a = sc.nextInt();
        System.out.print("int b = ");
        int b = sc.nextInt();
        System.out.print("int c = ");
        int c = sc.nextInt();
        System.out.print("int d = ");
        int d = sc.nextInt();
        System.out.println("a + b = " + add(a, b));
        System.out.println("a + b + c = " + add(a, b, c));
        System.out.println("a + b + c + d = " + add(a, b, c, d));

        System.out.print("float e = ");
        float e = sc.nextInt();
        System.out.print("float f = ");
        float f = sc.nextInt();
        System.out.print("float g = ");
        float g = sc.nextInt();
        System.out.print("float h = ");
        float h = sc.nextInt();
        System.out.println("e + f = " + add(e, f));
        System.out.println("e + f + g = " + add(e, f, g));
        System.out.println("e + f + g + h = " + add(e, f, g, h));

        sc.close();
    }
}
