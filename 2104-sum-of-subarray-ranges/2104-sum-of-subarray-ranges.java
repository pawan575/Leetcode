class Solution {
    public long subArrayRanges(int[] nums) {
     long ans=0;
     int n=nums.length;
     for(int i=0;i<n;i++){
        int minV=nums[i];
        int maxV=nums[i];
        for(int j=i;j<n;j++){
            maxV=Math.max(maxV,nums[j]);
            minV=Math.min(minV,nums[j]);
            ans+=maxV-minV;
        }
     }   
     return ans;
    }
}