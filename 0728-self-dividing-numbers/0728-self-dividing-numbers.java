class Solution {
    public boolean isSelfDivisible(int n){
        int temp=n;
        while(n>0){
            int ld=n%10;
            if(ld==0) return false;
            if( ld!=0 && temp%ld!=0) return false;
            n/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDivisible(i)){
                ans.add(i);
            }

        }
        return ans;
    }
}