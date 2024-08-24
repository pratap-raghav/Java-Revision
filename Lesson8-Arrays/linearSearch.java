import java.util.Scanner;

public class linearSearch {

    static int search(int element, int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length- ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid Array Length...");
        } else {
            int array[] = new int[n];
            System.out.println("Enter elements- ");

            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }

            System.out.print("Enter element- ");
            int e = sc.nextInt();
            int value = search(e, array);
            if (value == -1) {
                System.out.println("Not found...");
            } else {
                System.out.println(e + " fount at " + value);
            }

        }
        sc.close();
    }
}
