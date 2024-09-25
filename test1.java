public class test1 {
    public static void main(String[] args) {
        int arr[][] = {
                { 1, 1, 1, 0, 1 },
                { 1, 1, 1, 0, 1 },
                { 0, 0, 1, 0, 0 },
                { 1, 1, 1, 0, 0 },
                { 0, 0, 1, 1, 0 }
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int known[] = new int[5];
        int knows[] = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                known[i] = known[i] + arr[j][i];
                knows[i] = knows[i] + arr[i][j];
            }
        }
        System.out.print("Knows- ");
        for (int i = 0; i < 5; i++) {
            System.out.print(knows[i] + " ");
        }

        System.out.println();

        System.out.print("Known- ");
        for (int i = 0; i < 5; i++) {
            System.out.print(known[i] + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Celebrity- ");

        for (int i = 0; i < 5; i++) {
            if (knows[i] == 1 && known[i] == 5) {
                System.out.println(i + 1);
            }
        }
    }
}
