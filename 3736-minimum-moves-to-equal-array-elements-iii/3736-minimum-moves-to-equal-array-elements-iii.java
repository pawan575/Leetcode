class Solution {
    public int minMoves(int[] nums) {
        int max=-1;
        for(int ele:nums){
            if(ele>max) max=ele;
        }
        int count=0;
        for(int ele:nums){
            count+=max-ele;
        }
        return count;
    }
}