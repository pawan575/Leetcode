class Solution {
    public int reverse(int n){
        int sum=0;
        while(n>0){
            sum=sum*10+n%10;
            n/=10;
        }
        return sum;
    }
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int ans=0;
        int rd=reverse(n);
        int max=Math.max(n,rd);
        int min=Math.min(n,rd);
        for(int i=min;i<=max;i++){
            if(isPrime(i)) ans+=i;
        }
        return ans;
    }
}