import java.util.Scanner;

public class bubble {
    static int[] sort(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
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

            System.out.print("Unsorted Array- ");
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }

            System.out.println();
            int arr[] = sort(array);
            System.out.print("Sorted Array- ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        sc.close();
    }
}
