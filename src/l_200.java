public class l_200 {
    public int numIslands(char[][] grid) {
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == '1'){
                    //从这个点成功进入就说明这次深搜会搜索一个岛屿，所以这次深搜就得到了一个岛屿，结果加一
                    DFS(grid, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    public void DFS(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length )
            return;

        if(grid[r][c] == '0')
            return;
        //标记染色，将已经达到过的点进行染色标记为0，使得下次搜索时不再搜索这个点
        grid[r][c] = '0';

        //四个方向的分支进行深搜，与二叉树类似，只不过二叉树只有两个分支，这里的图的搜索可以看成是四个分支进行搜索
        DFS(grid, r - 1, c);
        DFS(grid, r + 1, c);
        DFS(grid, r, c - 1);
        DFS(grid, r, c + 1);
    }
}
