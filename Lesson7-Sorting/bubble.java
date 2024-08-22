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
        int array[] = { 1, -2, 3, 4, 5, 0, 9, 8, 3, 6, 7, 8 };
        System.out.print("Unsorted Array- ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        int arr[] = sort(array);
        System.out.print("Sorted Array- ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
