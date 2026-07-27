class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) return 0;
        for(int i=(int)(Math.pow(10,n)-1);i>=(int)(Math.pow(10,n-1));i--){
            int digit=i;
            int sum=0;
            while(digit>0){
                sum+=digit%10;
                digit/=10;
            }
            if(sum==s) return i;
        }
        return -1;
    }
}