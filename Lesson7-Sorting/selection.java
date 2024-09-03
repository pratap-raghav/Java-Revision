import java.util.Scanner;

public class selection {
    static int[] sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        return arr;
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
