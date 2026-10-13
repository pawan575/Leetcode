class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) nums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n;i++){
            nums[i]=(int)Math.pow(nums[i],2);
        }
        long sum=0; 
        int i=0;int j=n-1;
        while(i<j){
            sum+=nums[j--]-nums[i++];

        }
        if(i==j){
            sum+=nums[i];
        }
        return sum;
    }
}