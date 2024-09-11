import java.util.*;
public class reverseNo{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int temp=0;
        while(num!=0){
            temp = temp*10 + (num%10);
            
            num/=10;
        }
        System.out.println(temp);
        
        sc.close();
    }
}
