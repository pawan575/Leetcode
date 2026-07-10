class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[] row0=new int[m];
        int[] row1=new int[m];
        int[] col0=new int[n];
        int[] col1=new int[n];
       
        for(int i=0;i<m;i++){
            int zero=0;
            int one=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]==0) zero++;
                if(grid[i][j]==1) one++;
            }
            row0[i]=zero;
            row1[i]=one;
        }
        for(int j=0;j<n;j++){
            int zero=0;
            int one=0;
            for(int i=0;i<m;i++){
                if(grid[i][j]==0) zero++;
                if(grid[i][j]==1) one++;
            }
            col0[j]=zero;
            col1[j]=one;
        }

        for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              grid[i][j]=row1[i]+col1[j]-row0[i]-col0[j];
            }
        }
        return grid;
    }
}