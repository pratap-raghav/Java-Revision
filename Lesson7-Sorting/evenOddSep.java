import java.util.Scanner;

public class evenOddSep {

    static int[] seperate(int arr[]){
        int n = arr.length;
        int nArr[] = new int[n];
        int count = 0;
        for(int i=0; i<n;i++){
            if(arr[i]%2==0){
                nArr[count]=arr[i];
                count++;
            }
        }
        for(int i=0; i<n;i++){
            if(arr[i]%2==1){
                nArr[count]=arr[i];
                count++;
            }
        }
        return nArr;
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

            int sep[] = seperate(array);

            System.out.print("\nNew Array- ");
            for (int i = 0; i < sep.length; i++) {
                System.out.print(sep[i] + " ");
            }
        }
        sc.close();
    }
}
