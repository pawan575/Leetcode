class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        int idx=-1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                idx=i;
            }
        }
        int j=idx+1;
        int[] ans=new int[nums.length];
        int k=0;
        while(idx>=0 && j<nums.length){
            if(nums[idx]<=nums[j]) ans[k++]=nums[idx--];
            else ans[k++]=nums[j++];
        }
        while(idx>=0) ans[k++]=nums[idx--];
        while(j<nums.length) ans[k++]=nums[j++];
        return ans;
    }
}