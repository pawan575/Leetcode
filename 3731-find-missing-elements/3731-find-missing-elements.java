class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        // Arrays.sort(nums);
        // int lo=nums[0];
        // int hi=nums[nums.length-1];
        int lo=Integer.MAX_VALUE;
        int hi=Integer.MIN_VALUE;
        for(int ele:nums){
            lo=Math.min(lo,ele);
            hi=Math.max(hi,ele);
        }
        HashSet<Integer> set1=new HashSet<>();
        for(int ele: nums) set1.add(ele);
        // HashSet<Integer> set=new HashSet<>();
        // for(int i=lo;i<=hi;i++) set.add(i);
        List<Integer> ans=new ArrayList<>();
        for(int i=lo;i<=hi;i++){
            if(!set1.contains(i)) ans.add(i);
        }
        return ans;
    }
}