class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans=new int[nums.length];
        int idx=0;
        for(int ele:nums){
            if(ele<pivot) idx++;
        }
        for(int ele:nums){
            if(ele==pivot) ans[idx++]=ele;
        }
        int j=0;int k=idx;
      for(int i=0;i<nums.length;i++){
            if(nums[i]==pivot){
                continue;
            }
            if(nums[i]<pivot){
                ans[j++]=nums[i];
            }
            else if(k<nums.length){
                ans[k++]=nums[i];
            }
            
        }
        return ans;
    }
}