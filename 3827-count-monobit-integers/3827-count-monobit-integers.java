class Solution {
    public int countMonobit(int n) {
        if(n==1) return 2;
        if(n==0) return 1;
        int count=0;
        for(int i=0;i<n;i++){
            if(Math.pow(2,i)-1<=n) count++;
        }
        return count;
    }
}