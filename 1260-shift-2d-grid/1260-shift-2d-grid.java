class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        for (int x = 0; x < k; x++) {
            int[][] mat = new int[m][n];

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {

                    if (i == m - 1 && j == n - 1)
                        mat[0][0] = grid[i][j];
                    else if (j == n - 1)
                        mat[i + 1][0] = grid[i][j];
                    else
                        mat[i][j + 1] = grid[i][j];
                }
            }

            grid = mat;
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                a.add(grid[i][j]);

            }
            ans.add(a);
        }
        return ans;
    }
}