class Solution {
    public int pivotInteger(int n) {
        if(n==1) return 1;
       int lo=1;
       int hi=n;
       int lsum=0;
       int rsum=0;
       int ans=0;
       while(lo<hi){
        if(lsum<rsum){
            lsum+=lo;
            lo++;
        }
        else if(rsum<lsum){
            rsum+=hi;
            hi--;
        }
        else{
            lsum+=lo;
            rsum+=hi;
            lo++;
            hi--;
          
        }
       }  
       if(rsum==lsum && lo==hi) return lo;
       return -1;
    }
}