public class l_463 {
    public int islandPerimeter(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    return DFS(grid, i, j);
                }
            }
        }
        return 0;
    }

    int DFS(int[][] grid, int r, int c) {

        if (!(0 <= r && r < grid.length && 0 <= c && c < grid[0].length)) {
            return 1;
        }
        if (grid[r][c] == 0) {
            return 1;
        }
        if (grid[r][c] != 1) {
            return 0;
        }
        grid[r][c] = 2;
        return DFS(grid, r - 1, c)
                + DFS(grid, r + 1, c)
                + DFS(grid, r, c - 1)
                + DFS(grid, r, c + 1);
    }

}
