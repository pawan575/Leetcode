class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        int n=nums.length;
        int[] prefixGcd=new int[n];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            prefixGcd[i]=gcd(nums[i],max);
            
        }
        Arrays.sort(prefixGcd);
        long sum=0;
        int lo=0;
        int hi=n-1;
        while(lo<hi){
            sum=sum+(long)gcd(prefixGcd[lo],prefixGcd[hi]);
            lo++;
            hi--;
        }
        return sum;
    }
}