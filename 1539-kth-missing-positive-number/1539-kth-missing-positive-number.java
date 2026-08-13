class Solution {
    public int findKthPositive(int[] nums, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n=nums.length-1;
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums) set.add(ele);
        for(int i=1;i<nums[nums.length-1];i++){
            if(!set.contains(i)) arr.add(i);
        }
        if(k<=arr.size()) return arr.get(k-1);
        else{
            int rem=k-arr.size();
            return nums[n]+rem;
        }
    }
}