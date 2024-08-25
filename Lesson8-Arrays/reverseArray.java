import java.util.Scanner;

public class reverseArray {

    static int[] reverse(int arr[]) {
        int s = 0, e = arr.length - 1;
        while (s <= e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }

        return arr;
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

            reverse(array);

            System.out.print("\n\nReversed Array- ");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        sc.close();
    }
}