class Solution {
    public boolean rotation(int[][] mat,int[][] target, int rot){
        if(rot==0) return false;
            for(int i=0;i<mat.length;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        int n=mat.length;
        for(int i=0;i<n;i++){
            int l=0;
            int r=n-1;
            while(l<r){
                int temp=mat[i][l];
                mat[i][l]=mat[i][r];
                mat[i][r]=temp;
                l++;
                r--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]) return rotation(mat,target,rot-1);
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat,int[][] target) {
       return rotation(mat,target,4);
       
    }
}