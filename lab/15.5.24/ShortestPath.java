import java.util.*;

class ShortestPath {
    public static int[] helper(){
        List<List<List<Integer>>> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        int v = sc.nextInt();
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<>());
            System.out.println("Enter no of nodes node " + i + " is connected to");
            int n = sc.nextInt();
            for (int j = 0; j < n; j++) {
                System.out.println("Enter 'connectedNode-weight'");
                int node = sc.nextInt();
                int weight = sc.nextInt();
                List<Integer> temp = new ArrayList<>();
                temp.add(node);
                temp.add(weight);
                list.get(i).add(temp);
            }
        }
        System.out.println("Enter source vertex");
        int s = sc.nextInt();
        sc.close();
        return dijkstra(v, list, s);
    }

    public static int[] dijkstra(int v, List<List<List<Integer>>> adjList, int src) {
        int[] dist = new int[v];
        boolean[] visited = new boolean[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        dist[src] = 0;
        pq.offer(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int node = current[0];
            int distance = current[1];
            if (visited[node]) continue;
            visited[node] = true;

            for (List<Integer> neighbor : adjList.get(node)) {
                int nextNode = neighbor.get(0);
                int weight = neighbor.get(1);
                if (!visited[nextNode] && dist[node] + weight < dist[nextNode]) {
                    dist[nextNode] = dist[node] + weight;
                    pq.offer(new int[]{nextNode, dist[nextNode]});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int[] result = helper();
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < result.length; i++)
            System.out.println(i + "    " + result[i]);
    }
}

//3 2 1 1 2 6 2 2 3 0 1 2 1 3 0 6 2 
