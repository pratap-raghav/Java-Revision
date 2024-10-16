import java.util.*;

public class TopSort {

    static void sortUtil(int v, List<List<Integer>> adj, boolean[] vis, Stack<Integer> stk) {
        vis[v] = true;
        for (int i : adj.get(v)) {
            if (!vis[i])
                sortUtil(i, adj, vis, stk);
        }
        stk.push(v);
    }

    static void topSort(List<List<Integer>> adj, int V) {
        Stack<Integer> stk = new Stack<>();
        boolean[] vis = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!vis[i])
                sortUtil(i, adj, vis, stk);
        }

        while (!stk.empty()) {
            System.out.print(stk.pop() + " ");
        }
    }

    public static void main(String[] args) {
        int V = 5;
        List<List<Integer>> edges = new ArrayList<>();
        edges.add(Arrays.asList(0, 1));
        edges.add(Arrays.asList(0, 2));
        edges.add(Arrays.asList(1, 3));
        edges.add(Arrays.asList(2, 3));
        edges.add(Arrays.asList(3, 4));

        List<List<Integer>> adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (List<Integer> e : edges) {
            adj.get(e.get(0)).add(e.get(1));
        }

        topSort(adj, V);
    }
}
