import java.util.Scanner;

public class arrAdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("Enter order of square- ");
        // int n = sc.nextInt();
        int n = 3;
        // int array[][] = new int[n][n];
        int array[][] = {   { 0, 1, 2 }, 
                            { 0, 1, 2 }, 
                            { 0, 1, 2 } };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int arr[] = new int[n * n];
        int count = 0;
        int r = n / 2 + 1;
        for (int x = 0; x <= r; x++) {
            for (int y = x, z = 0; y >= 0 && z <= x; y--, z++) {
                arr[count] = array[y][z];
                count++;
                // System.out.println(array[y][z] + "    "+y+""+z);
            }
        }

        for (int x = 1; x <= r; x++) {
            for (int y = r, z = x; z <= r && y >= x; y--, z++) {
                arr[count] = array[y][z];
                count++;
                // System.out.println(array[y][z] + "    "+y+""+z);
            }
        }
        System.out.println();

        count = 0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n; j++) {
        //         System.out.print(arr[i+j] + " ");
        //     }
        //     System.out.println();
        // }


        int rows = n;
        for (int i = 1; i <= rows; i++) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int k = 1; k <= i; k++) {
                System.out.print(arr[count]+" ");
                count++;
            }
            System.out.println();
        }

        // Print the lower half of the pyramid diamond (inverted)
        for (int i = rows - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars with spaces
            for (int k = 1; k <= i; k++) {
                System.out.print(arr[count]+" ");
                count++;
            }
            System.out.println();
        }

        sc.close();
    }
}
