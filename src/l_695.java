public class l_695 {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    max=Math.max(max, DFS(grid, i, j));
                }
            }
        }
        return max;
    }

    int DFS(int[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length) {
            return 0;
        }
        if (grid[r][c] == 0) {
            return 0;
        }

        grid[r][c] = 0;

        return 1+
                DFS(grid, r + 1, c)+
                DFS(grid, r - 1, c)+
                DFS(grid, r, c + 1)+
                DFS(grid, r, c - 1);
    }

}
