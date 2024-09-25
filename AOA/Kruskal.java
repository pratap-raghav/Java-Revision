import java.util.*;

class Kruskal {

    class E implements Comparable<E> {
        int s, d, w;

        E(int src, int dest, int weight) {
            s = src;
            d = dest;
            w = weight;
        }

        @Override
        public int compareTo(E other) {
            return this.w - other.w;
        }
    }

    private int V;
    private List<E> edges;

    Kruskal(int v) {
        V = v;
        edges = new ArrayList<>();
    }

    void addE(int src, int dest, int weight) {
        edges.add(new E(src, dest, weight));
    }

    int find(int[] p, int k) {
        if (p[k] == -1)
            return k;
        return find(p, p[k]);
    }

    void union(int[] p, int x, int y) {
        int xset = find(p, x);
        int yset = find(p, y);
        p[xset] = yset;
    }

    void kruskal() {
        E[] result = new E[V - 1];
        int[] p = new int[V];
        Arrays.fill(p, -1);

        Collections.sort(edges);

        int e = 0;
        for (E edge : edges) {
            int x = find(p, edge.s);
            int y = find(p, edge.d);
            if (x != y) {
                result[e++] = edge;
                union(p, x, y);
            }
        }

        System.out.println("Edge \tWeight");
        for (E edge : result) {
            if (edge != null) {
                System.out.println(edge.s + " - " + edge.d + "\t" + edge.w);
            }
        }
    }

    public static void main(String[] args) {
        Kruskal g = new Kruskal(6);
        g.addE(0, 1, 4);
        g.addE(0, 5, 6);
        g.addE(1, 2, 5);
        g.addE(1, 4, 3);
        g.addE(2, 3, 7);
        g.addE(3, 4, 2);
        g.addE(5, 2, 8);
        g.addE(4, 5, 9);
        g.kruskal();
    }
}
