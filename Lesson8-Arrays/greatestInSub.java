import java.util.*;

public class greatestInSub {

    static int subSum(int arr[]) {
        int sum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int cMax = Integer.MIN_VALUE;;
                for (int k = i; k <= j; k++) {
                    if(cMax<arr[k]){
                        cMax = arr[k]; 
                    }
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
                System.out.println("Max = "+cMax);

            }
        }
        return sum;
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
            System.out.println();
            System.out.println("Max sum - "+subSum(array));
            

        }
        sc.close();
    }
}
