class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            int max=nums[i];
            int count=0;
            for(int j=0;j<n;j++){
                if(j!=i && max>nums[j] ) count++;
            }
            ans[i]=count;
        }
        return ans;
    }
}