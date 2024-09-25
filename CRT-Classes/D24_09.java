import java.util.*;

public class D24_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for(int k=0; k<t; k++){
            int n = sc.nextInt();
            long array[] = new long[n];
            for(int i=0; i<n; i++){
                array[i]=sc.nextLong();
            }
            long sum = Long.MAX_VALUE ;
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                    long temp = array[i]+array[j]+j-i;
                    if(sum>temp){
                        sum=temp;
                    }
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
