//{ Driver Code Starts
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = Integer.parseInt(sc.nextLine().trim());

        while (t-- > 0) {
            int V = Integer.parseInt(sc.nextLine().trim());
            int E = Integer.parseInt(sc.nextLine().trim());

            List<int[]> edgeList = new ArrayList<>();

            for (int i = 0; i < E; i++) {
                String[] parts = sc.nextLine().split(" ");
                int u = Integer.parseInt(parts[0]);
                int v = Integer.parseInt(parts[1]);
                edgeList.add(new int[] {u, v});
                edgeList.add(new int[] {v, u});
            }

            int[][] edges = new int[edgeList.size()][2];
            for (int i = 0; i < edgeList.size(); i++) {
                edges[i] = edgeList.get(i);
            }

            int m = Integer.parseInt(sc.nextLine().trim());

            Solution sol = new Solution();
            System.out.println(sol.graphColoring(V, edges, m) ? "true" : "false");
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends


class Solution {
    public boolean graphColoring(int v, int[][] edges, int m) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) adj.add(new ArrayList<>());
        
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        int[] colors = new int[v];
        return solve(0, adj, colors, m, v);
    }

    private boolean solve(int node, List<List<Integer>> adj, int[] colors, int m, int v) {
        if (node == v) return true;

        for (int c = 1; c <= m; c++) {
            if (isSafe(node, c, adj, colors)) {
                colors[node] = c;
                if (solve(node + 1, adj, colors, m, v)) return true;
                colors[node] = 0;
            }
        }

        return false;
    }

    private boolean isSafe(int node, int color, List<List<Integer>> adj, int[] colors) {
        for (int neighbor : adj.get(node)) {
            if (colors[neighbor] == color) return false;
        }
        return true;
    }
}

