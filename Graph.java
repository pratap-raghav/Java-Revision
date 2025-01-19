import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {

    static void findKthNode(int current, int count, int k, List<List<Integer>> edges, Set<Integer> visited, Set<Integer> result) {
        if (count == k) {
            result.add(current);
            return;
        }

        for (int i = 0; i < edges.get(current).size(); i++) {
            if (edges.get(current).get(i) == 1 && !visited.contains(i)) {
                visited.add(i);
                findKthNode(i, count + 1, k, edges, visited, result);
                visited.remove(i); // Backtrack for other paths
            }
        }
    }

    public static void main(String[] args) {
        int V = 8;
        Set<Integer> visited = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        List<List<Integer>> edges = new ArrayList<>(V);

        edges.add(Arrays.asList(0, 1, 1, 0, 0, 1, 0, 0));
        edges.add(Arrays.asList(0, 0, 0, 1, 1, 0, 0, 0));
        edges.add(Arrays.asList(0, 0, 0, 1, 1, 0, 0, 0));
        edges.add(Arrays.asList(0, 0, 0, 0, 0, 1, 1, 0));
        edges.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 1));
        edges.add(Arrays.asList(0, 0, 0, 0, 0, 0, 0, 1));
        edges.add(Arrays.asList(1, 0, 1, 0, 0, 0, 1, 0));
        edges.add(Arrays.asList(0, 0, 1, 0, 0, 1, 0, 0));

        int k = 2;
        int source = 0;

        visited.add(source);
        findKthNode(source, 0, k, edges, visited, result);

        System.out.println("Nodes at distance " + k + " from source " + source + ": " + result);
    }
}
