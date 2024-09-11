import java.util.Scanner;

public class abc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = Long.MAX_VALUE;
        int n = sc.nextInt();
        int pos = 0;
        for(int i=0; i<n; i++){
            long v = sc.nextLong();
            if(m>v){
                m = v;
                pos = i+1;
            }

        }
        System.out.println(m+" "+pos);
        sc.close();
    }
}
