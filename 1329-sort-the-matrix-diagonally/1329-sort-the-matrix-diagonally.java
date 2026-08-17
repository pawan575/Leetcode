class Solution {
    public int[][] diagonalSort(int[][] mat) {
    int n=mat.length;
    int m=mat[0].length;
    
        for (int k = 0; k <n; k++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int i = k;
            int j = 0;
            while (i<n && j<m) {
                arr.add(mat[i][j]);
                i++;
                j++;
            }
           Collections.sort(arr);
            int idx = 0;
            i = k;
            j = 0;
            while (i<n && j<m) {
                mat[i][j] = arr.get(idx++);
                i++;
                j++;
            }

        }
        for (int k = 1; k < m; k++) {
            ArrayList<Integer> arr = new ArrayList<>();
            int i = 0;
            int j = k;
            while (i<n && j<m) {
                arr.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(arr);
            int idx = 0;
            i = 0;
            j = k;
            while (i<n && j<m) {
                mat[i][j] = arr.get(idx++);
                i++;
                j++;
            }

        }
        return mat;
    }
}