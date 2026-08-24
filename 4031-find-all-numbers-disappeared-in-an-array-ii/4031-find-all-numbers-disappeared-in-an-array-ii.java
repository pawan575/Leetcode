class Solution {
    public List<List<Integer>> findDisappearedNumbers(int[] nums, int lower, int upper) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums) set.add(ele);
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=lower;i<=upper;i++){
            List<Integer> arr=new ArrayList<>();
            if(!set.contains(i)) arr.add(i);
            while(!set.contains(i) && i<=upper){
                i++;

            }
            if((i-1)>=lower && (i-1)<=upper && !set.contains(i-1)) arr.add(i-1);
            if(arr.size()!=0) ans.add(arr);
        }

        return ans;
    }
}