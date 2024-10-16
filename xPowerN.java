import java.util.Scanner;

public class xPowerN {

    static int mul(int y, int z){
        if (z==0)
            return 1;
        return (y * mul(y, z-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base- ");
        int x = sc.nextInt();

        System.out.print("Enter Power- ");
        int n = sc.nextInt();

        System.out.println(mul(x,n));

        sc.close();

    }
}
