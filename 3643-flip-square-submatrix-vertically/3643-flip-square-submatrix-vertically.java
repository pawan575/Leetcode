class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int[][] mat=new int[k][k];
        for(int i1=0, i=x;i1<k ||i<(x+k);i1++,i++){
            for(int j1=0, j=y;j1<k || j<(y+k);j1++,j++){
                mat[i1][j1]=grid[i][j];
            }
        }
        int top=0;
        int bottom=mat.length-1;
        while(top<bottom){
            int[] temp=mat[top];
            mat[top]=mat[bottom];
            mat[bottom]=temp;
            top++;
            bottom--;
        } 
        for(int i1=0, i=x;i1<k ||i<(x+k);i1++,i++){
            for(int j1=0, j=y;j1<k ||j<(y+k);j1++,j++){
                grid[i][j]=mat[i1][j1];
            }
        }       

        return grid;
    }
}