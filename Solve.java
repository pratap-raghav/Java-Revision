import java.util.*;

class Item {
    int val, wt;
    Item(int v, int w) {
        this.val = v;
        this.wt = w;
    }
}

class ItemComp implements Comparator<Item> {
    @Override
    public int compare(Item a, Item b) {
        double r1 = (double)(a.val) / (double)(a.wt); 
        double r2 = (double)(b.val) / (double)(b.wt); 
        if (r1 < r2) return 1; 
        else if (r1 > r2) return -1; 
        else return 0; 
    }
}

public class Solve {
    static double fracKnapsack(int W, Item[] arr, int n) {
        Arrays.sort(arr, new ItemComp()); 
        
        int curW = 0; 
        double finalVal = 0.0; 
        
        for (int i = 0; i < n; i++) {
            if (curW + arr[i].wt <= W) {
                curW += arr[i].wt;
                finalVal += arr[i].val;
            } else {
                int rem = W - curW;
                finalVal += ((double)arr[i].val / (double)arr[i].wt) * (double)rem;
                break;
            }
        }
        
        return finalVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Num items: ");
        int n = sc.nextInt();
        
        System.out.print("Max weight: ");
        int w = sc.nextInt();
        
        Item[] arr = new Item[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Val and wt for item " + (i + 1) + ": ");
            int val = sc.nextInt();
            int wt = sc.nextInt();
            arr[i] = new Item(val, wt);
        }
        
        double ans = fracKnapsack(w, arr, n);
        System.out.println("Max value is " + ans);
        
        sc.close();
    }
}
