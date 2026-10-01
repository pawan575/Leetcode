class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer> map=new HashMap<>();
        int n=grid.length;
        for(int i=1;i<=n*n;i++){
            map.put(i,1);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int freq=map.get(grid[i][j]);
                map.put(grid[i][j],freq-1);
            }
        }
        int fst=-1;
        int sec=-1;
        for(int ele:map.keySet()){
            if(map.get(ele)==1){
                sec=ele;
            }
            if(map.get(ele)==-1){
                fst=ele;
            }
        }
        int[] ans=new int[2];
        ans[0]=fst;
        ans[1]=sec;
        return ans;
    }
}