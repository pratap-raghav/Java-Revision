import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even= 0;
        int odd= 0;
        int pos= 0;
        int neg= 0;
        for(int i = 0;i<n; i++){
            int num = sc.nextInt();
            if(num%2==0)
                even++;
            else
                odd++;
            if(num<0)
                neg++;
            else if(num>0)
                pos++;
        }
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);
        
        sc.close();
    }
}

// A - 1 to N
// public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i = 1;i<=n; i++){
    //         System.out.println(i);
    //     }
    //     sc.close();
    // }


// D - Corrrect passwd

// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int pass = 1999;
//     while(true){
//         int n = sc.nextInt();
//         if(n==pass){
//             System.out.println("Correct");
//             break;
//         }
//         else
//             System.out.println("Wrong");
//     }
//     sc.close();
// }

// G - Factorial
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     long n = sc.nextInt();
//     for(int i=0;i<n;i++){
//         long fact = 1;
//         long num = sc.nextInt();
//         for(long j=1; j<=num; j++){
//             fact=fact*j;
//         }
//         System.out.println(fact);
//     }
//     sc.close();
// }

// L - GCD
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();
//     int flag = 1;
//     int small = a<b?a:b;
//     for(int i=1; i<=small; i++){
//         if(a%i==0 && b%i==0){
//             flag=i;
//         }
//     }
//     System.out.println(flag);
//     sc.close();
// }

// Y - Easy Fibonacci
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int a = 0;
//     int b = 1;
//     if (n==1)
//         System.out.println(a);

//     else if(n==2)
//         System.out.println(a+" "+b);

//     else{
//         System.out.print(a+" "+b);
//         for(int i=2; i<n; i++){
//             int sum = a+b;
//             a=b;
//             b=sum;
//             System.out.print(" "+sum);
//         }
//     }
//     sc.close();
// }

// Even Numbers
// import java.util.Scanner;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i = 2;i<=n; i=i+2){
//             System.out.println(i);
//         }
//         if (n==1) {
//             System.out.println(-1);
//         }
//         sc.close();
//     }
// }