import java.util.Scanner;

public class insertion {
    public static int[] sort(int[] a) {
        int n = a.length;

        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;

            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = key;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length- ");
        int n = sc.nextInt();

        
        int array[] = new int[n];
        System.out.println("Enter elements- ");

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Unsorted Array- ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        int arr[] = sort(array);
        System.out.print("\nSorted Array- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}
