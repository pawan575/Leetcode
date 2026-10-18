class Solution {
    public int[] lastVisitedCell(char[][] grid) {
               int strt = 0;
        int end = 0;

        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int lastRow = 0;
        int lastCol = 0;

        while (strt >= 0 && strt < m &&
               end >= 0 && end < n) {

            if (visited[strt][end]) {
                return new int[]{lastRow, lastCol};
            }

            visited[strt][end] = true;

            lastRow = strt;
            lastCol = end;

            char ch = grid[strt][end];

            if (ch == 'L') {
                end--;
            } else if (ch == 'R') {
                end++;
            } else if (ch == 'U') {
                strt--;
            } else if (ch == 'D') {
                strt++;
            }
        }

        return new int[]{lastRow, lastCol};
    }
}