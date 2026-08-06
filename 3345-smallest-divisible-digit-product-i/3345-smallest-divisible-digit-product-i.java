class Solution {
    public int smallestNumber(int n, int t) {
      int ans=0;
      for(int i=n;i<=100;i++){
        int digit=i;
        int pd=1;
        while(digit>0){
            pd*=digit%10;
            digit/=10;
        }
        if(pd%t==0){
            ans=i;
            break;
        }
      }  
      return ans;
    }
}