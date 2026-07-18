class Solution {
    // public int gcd(int a,int b){
    //     while(b!=0){
    //         int temp=b;
    //         b=a%b;
    //         a=temp;
    //     }
    //     return a;
    // }
    public int recGCD(int a,int b){
        if(b==0) return a;
        return recGCD(b,a%b);
    }
    public int findGCD(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max) max=nums[i];
            if(nums[i]<min) min=nums[i];
        }
        // int ans=gcd(min,max);
        int ans=recGCD(min,max);
        return ans;
    }
}