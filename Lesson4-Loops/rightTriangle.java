import java.util.*;

public class rightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Right Triangle");
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {

            for (int j = row - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = row - i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");
        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
