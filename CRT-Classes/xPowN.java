import java.util.Scanner;

public class xPowN {
    static int multi(int y, int z){
        if(z==0)
            return 1;

        else if(z%2==1){
            return multi(y, z/2)*multi(y, z/2)*y;
        }
        else{
            return multi(y, z/2)*multi(y, z/2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base- ");
        int x = sc.nextInt();

        System.out.print("Enter Power- ");
        int n = sc.nextInt();

        System.out.println(multi(x,n));

        sc.close();
    }
}
