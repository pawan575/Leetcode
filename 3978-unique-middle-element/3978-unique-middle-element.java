class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        if(nums.length==1) return true;
        int middle=nums.length/2;
        int count=0;
        for(int ele:nums){
            if(ele==nums[middle]) count++;
        }
        if(count>1) return false;
        return true;
    }
}