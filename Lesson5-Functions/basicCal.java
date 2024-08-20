import java.util.Scanner;

public class basicCal {
    
    static void add(float a, float b){
        System.out.println("a + b = " + (a+b) + " From function\n");
    }

    static void sub(float a, float b){
        System.out.println("a - b = " + (a-b) + " From function\n");
    }

    static void multi(float a, float b){
        System.out.println("a * b = " + (a*b) + " From function\n");
    }

    static void div(float a, float b){
        System.out.println("a / b = " + (a/b) + " From function\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        int a = sc.nextInt();

        System.out.print("a = ");
        int b = sc.nextInt();


        System.out.println("\na + b = " + (a+b) + " From main");
        add(a, b);

        System.out.println("a - b = " + (a-b) + " From main");
        sub(a, b);

        System.out.println("a * b = " + (a*b) + " From main");
        multi(a, b);

        System.out.println("a / b = " + (a/(5)) + " From main");
        div(a, b);

        sc.close();
    }
}
