import java.util.*;

public class abc1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
        }
        int start = 0, end = n-1;
        int flag = 0;
        while(start<=end){
            if(arr[start]!=arr[end]){
                flag = 1;
                break;
            }
            start++;
            end--;
        }
        if(flag==1)
            System.out.print("NO");
        else
         System.out.print("YES");
        sc.close();
    }
}
