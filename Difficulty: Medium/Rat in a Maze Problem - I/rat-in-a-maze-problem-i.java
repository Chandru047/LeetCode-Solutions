//{ Driver Code Starts
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while (t-- > 0) {
            int n = Integer.parseInt(sc.nextLine());
            int[][] maze = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    maze[i][j] = sc.nextInt();
                }
            }

            if (sc.hasNextLine()) sc.nextLine();

            Solution obj = new Solution();
            ArrayList<String> result = obj.ratInMaze(maze);

            if (result.isEmpty()) {
                System.out.print("[]");
            } else {
                for (String path : result) {
                    System.out.print(path + " ");
                }
            }
            System.out.println();
            System.out.println("~");
        }

        sc.close();
    }
}

// } Driver Code Ends



class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> paths = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        solve(0, 0, maze, n, "", visited, paths);
        return paths;
    }

    private void solve(int i, int j, int[][] maze, int n, String path, boolean[][] visited, ArrayList<String> paths) {
        if (i == n - 1 && j == n - 1) {
            paths.add(path);
            return;
        }

        if (i < 0 || i >= n || j < 0 || j >= n || visited[i][j] || maze[i][j] == 0) {
            return;
        }

        visited[i][j] = true;

        solve(i + 1, j, maze, n, path + "D", visited, paths);
        solve(i, j - 1, maze, n, path + "L", visited, paths);
        solve(i, j + 1, maze, n, path + "R", visited, paths);
        solve(i - 1, j, maze, n, path + "U", visited, paths);

        visited[i][j] = false;
    }
}
