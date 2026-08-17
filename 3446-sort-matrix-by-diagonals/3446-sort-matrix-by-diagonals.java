class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        for (int k = 0; k <n; k++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int i = k;
            int j = 0;
            while (i<n && j<n) {
                arr.add(grid[i][j]);
                i++;
                j++;
            }
            arr.sort(Collections.reverseOrder());
            int idx = 0;
            i = k;
            j = 0;
            while (i<n && j<n) {
                grid[i][j] = arr.get(idx++);
                i++;
                j++;
            }

        }
        for (int k = 1; k < n; k++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int i = 0;
            int j = k;
            while (i<n && j<n) {
                arr.add(grid[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr);
            int idx = 0;
            i = 0;
            j = k;
            while (i<n && j<n) {
                grid[i][j] = arr.get(idx++);
                i++;
                j++;
            }

        }
        return grid;
    }
}