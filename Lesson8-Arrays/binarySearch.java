import java.util.Scanner;

public class binarySearch {

    static int bSearch(int arr[], int element) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int m = (s + e) / 2;
            if (arr[m] == element) {
                return m;
            } else if (arr[m] > element) {
                e = m - 1;
            } else {
                s = m + 1;
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

            System.out.print("Array- ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.print("\n\n\nEnter element to search- ");
            int element = sc.nextInt();

            int value = bSearch(array, element);
            if (value == -1)
                System.out.println("Element not found...");

            else
                System.out.println("Element '" + element + "' found at index " + value);

        }
        sc.close();

    }
}
