class Solution {
    public int[] resultArray(int[] nums) {
       int n=nums.length;
       int[] ans=new int[n];
       ArrayList<Integer> arr1=new ArrayList<>(); 
       ArrayList<Integer> arr2=new ArrayList<>(); 
       arr1.add(nums[0]);
       arr2.add(nums[1]);
       for(int i=2;i<n;i++){
            int lst1=arr1.size()-1;
            int lst2=arr2.size()-1;

            if(arr1.get(lst1)>arr2.get(lst2)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
       }
       int idx=0;
       for(int j=0;j<arr1.size();j++){
        ans[idx++]=arr1.get(j);
       }
       for(int j=0;j<arr2.size();j++){
        ans[idx++]=arr2.get(j);
       }


       return ans; 

      
    }
}