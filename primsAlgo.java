import java.util.*;

class primsAlgo {

    private static final int V = 6; 

    int minKey(int k[], Boolean mSet[]) {
        int min = Integer.MAX_VALUE, idx = -1;
        for (int v = 0; v < V; v++)
            if (!mSet[v] && k[v] < min) {
                min = k[v];
                idx = v;
            }
        return idx;
    }

    void printMST(int p[], int g[][]) {
        System.out.println("Edge \tWeight");
        for (int i = 1; i < V; i++)
            System.out.println(p[i] + " - " + i + "\t" + g[i][p[i]]);
    }

    void primMST(int g[][]) {
        int p[] = new int[V];
        int k[] = new int[V];
        Boolean mSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            k[i] = Integer.MAX_VALUE;
            mSet[i] = false;
        }

        k[0] = 0;
        p[0] = -1;

        for (int cnt = 0; cnt < V - 1; cnt++) {
            int u = minKey(k, mSet);
            mSet[u] = true;

            for (int v = 0; v < V; v++)
                if (g[u][v] != 0 && !mSet[v] && g[u][v] < k[v]) {
                    p[v] = u;
                    k[v] = g[u][v];
                }
        }
        printMST(p, g);
    }

    public static void main(String[] args) {
        primsAlgo t = new primsAlgo();
        int g[][] = new int[][] { 
            { 0, 4, 0, 0, 0, 6 },
            { 4, 0, 5, 0, 3, 0 },
            { 0, 5, 0, 7, 0, 8 },
            { 0, 0, 7, 0, 2, 0 },
            { 0, 3, 0, 2, 0, 9 },
            { 6, 0, 8, 0, 9, 0 } 
        };
        t.primMST(g);
    }
}


// int g[][] = new int[][] { 
//             { 0, 4, 0, 0, 0, 6 },
//             { 4, 0, 5, 0, 3, 0 },
//             { 0, 5, 0, 7, 0, 8 },
//             { 0, 0, 7, 0, 2, 0 },
//             { 0, 3, 0, 2, 0, 9 },
//             { 6, 0, 8, 0, 9, 0 } 
//         };

// can you visualize this tree in ascii art


//      (0)
//     /   \
//   4/     \6
//   /       \
// (1)---5---(2)
//  |         |
//  3         8
//  |         |
// (4)---2---(3)
//     \     /
//      \   /  
//       \9/   
//       (5)
// output - 
// Edge    Weight
// 0 - 1   4
// 1 - 2   5
// 4 - 3   2
// 1 - 4   3
// 0 - 5   6