import java.util.Scanner;
public class mirror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row- ");
        int row = sc.nextInt();
        System.out.print("Enter Column- ");
        int col = sc.nextInt();
        int array[][] = new int[row][col];

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("   ");

            for(int j=col-1; j>=0; j--){
                System.out.print(array[i][j]+" ");
            }

            System.out.println();
        }
        System.out.println();
        for(int i=row-1; i>=0; i--){
            for(int j=0; j<col; j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.print("   ");
            for(int j=col-1; j>=0; j--){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
