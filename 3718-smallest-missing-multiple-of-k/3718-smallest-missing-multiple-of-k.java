class Solution {
    public int missingMultiple(int[] nums, int k) {
    
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            if(ele%k==0) set.add(ele);
        }
        
        int ans=1;
        for(int i=1;i<=100;i++){
            int val=i*k;
            if(!set.contains(val)){
                ans=val;
                break;
            }
        }
        if(set.contains(ans)) return nums.length+1;
        return ans;
    }
}