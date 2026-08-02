class Solution {
    public int[] countPoints(int[][] p, int[][] q) {
        int len=q.length;
        int[] ans=new int[len];
        for(int i=0;i<q.length;i++){
            int count=0;
            for(int j=0;j<p.length;j++){
                int dx=p[j][0]-q[i][0];
                int dy=p[j][1]-q[i][1];
                int rad=q[i][2];
                if(dx*dx+dy*dy<=rad*rad) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}