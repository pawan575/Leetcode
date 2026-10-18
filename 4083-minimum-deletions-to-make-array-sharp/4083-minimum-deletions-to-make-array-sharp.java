class Solution {
    public int minDeletions(int[] nums) {
        int count=0;
        for(int i=1;i<nums.length;i++){
            int a=nums[i-1];
            int b=nums[i];
            if((a^b)==0) count++;
        }
        return count;
    }
}