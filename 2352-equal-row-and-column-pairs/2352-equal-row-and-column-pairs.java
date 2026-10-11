class Solution {
    public int equalPairs(int[][] grid) {
        int n=grid.length;
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[j][i]=grid[i][j];
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(Arrays.equals(grid[i],arr[j])) count++;
            }
        }
        return count;


    }
}