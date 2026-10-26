class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> permute(int[] nums) {
        ans=new LinkedList<>();
        helper(nums,new ArrayList<>());
        return ans;
    }
    public void helper(int[] nums,ArrayList<Integer>lst){
        if(lst.size()==nums.length){
            ans.add(new ArrayList(lst));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=-11){
                int temp=nums[i];
                lst.add(temp);
                nums[i]=-11;
                helper(nums,lst);
                lst.remove(lst.size()-1);
                nums[i]=temp;
            }
        }
    }
}