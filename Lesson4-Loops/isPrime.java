import java.util.*;

public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        boolean flag = true;
        for( int i=2; i<=Math.sqrt(num); i++ ){
            if(num%i==0){
                flag = false;
            }
        }
        if( flag == false )
            System.out.println(num+" is not a prime number.");
        else
            System.out.println(num+" is a prime number.");
        sc.close();
    }
}
