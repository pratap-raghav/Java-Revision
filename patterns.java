import java.util.Scanner;

public class patterns {

    static void hollowRect(Scanner sc) {

        System.out.print("Height- ");
        int height = sc.nextInt();

        System.out.print("Width- ");
        int width = sc.nextInt();

        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }

        System.out.println();

        for (int i = 0; i < height - 2; i++) {
            System.out.print("* ");

            for (int j = 0; j < width - 2; j++) {
                System.out.print("  ");
            }

            System.out.println("* ");
        }

        for (int i = 0; i < width; i++) {
            System.out.print("* ");
        }

    }

    static void invRotHalfPyramid(Scanner sc) {

        System.out.print("Enter Rows- ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = row - i; j > 1; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void invHaldPyramidNum(Scanner sc) {
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {

            for (int j = 1; j < row - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void floydsTriangle(Scanner sc){
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        int count = 1;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(count+"\t");
                count++;
            }
            System.out.println();
        }
    }

    static void triangle01(Scanner sc){
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        int count = 1;
        for (int i = 0; i < row; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print(count%2+" ");
                count++;
            }
            System.out.println();
        }
    }
    

    static void butterfly(Scanner sc){
        System.out.print("Enter number of column: ");
        int col = sc.nextInt();
        for(int i=0; i<col; i++){
            for(int j =0; j<=i; j++){
                System.out.print("* ");
            }

            for(int j = 0; j<=(col-(i*2));j++){
                System.out.print("  ");
            }

            for(int j =0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // hollowRect(sc);
        // invRotHalfPyramid(sc);
        // invHaldPyramidNum(sc);
        // floydsTriangle(sc);
        // triangle01(sc);
        butterfly(sc);
        sc.close();
    }
}
