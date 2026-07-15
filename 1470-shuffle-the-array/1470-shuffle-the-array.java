class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int slow=0;
        int fast=n;
        int i=0;
        while(i<2*n){
        if(i%2==0){
             ans[i]=nums[slow];
             slow++;
             }

            else {
            ans[i]=nums[fast];
            fast++;
            }
            i++;
        }
        return ans;
    }
}