import java.util.*;

public class breakUse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            if(num%10==0){
                System.out.println("Exiting...");
                break;
            }
            System.out.println("Entered Number: "+num);
        }
        sc.close();
    }
}
