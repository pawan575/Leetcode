class Solution {
    public int firstStableIndex(int[] nums, int val) {
        for(int i=0;i<nums.length;i++){
            int max=nums[0];
            for(int j=0;j<=i;j++){
                max=Math.max(nums[j],max);
            }
            int min=nums[nums.length-1];
            for(int k=i;k<nums.length;k++){
                min=Math.min(min,nums[k]);
            }
            if(max-min<=val) return i;
        }
        return -1;
    }
}