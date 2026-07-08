class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long digit=0;
        while(n>0){
            int ld=n%10;
            if(ld!=0){
                digit=digit*10+ld;
            }
            sum+=ld;
            n/=10;
        }
        long x=0;
        while(digit>0){
            x=x*10+digit%10;
            digit/=10;
        }
        return x*sum;
    }
}