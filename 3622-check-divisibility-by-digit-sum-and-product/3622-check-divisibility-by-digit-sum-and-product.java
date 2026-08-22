class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int pd=1;
        int temp=n;
        while(n>0){
            int ld=n%10;
            sum+=ld;
            pd*=ld;
            n/=10;
        }
        sum=sum+pd;
        if(temp%sum==0) return true;
        return false;
    }
}