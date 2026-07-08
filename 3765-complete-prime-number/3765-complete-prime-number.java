class Solution {
    public boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean completePrime(int num) {
        if(!isPrime(num)) return false;
        String str=String.valueOf(num);
        for(int i=0;i<str.length();i++){
            int n=Integer.valueOf(str.substring(0,i+1));
            int m=Integer.valueOf(str.substring(i,str.length()));
            if(!isPrime(n)) return false;
            if(!isPrime(m)) return false;
        }
        return true;

    }
}