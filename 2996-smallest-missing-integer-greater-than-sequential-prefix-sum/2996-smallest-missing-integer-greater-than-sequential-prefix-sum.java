class Solution {
    public int missingInteger(int[] nums) {
      int n=nums.length;
      int[] arr=new int[n];
      for(int i=0;i<n;i++) arr[i]=nums[i];
      Arrays.sort(arr);
      int sum=nums[0];
      for(int i=1;i<n;i++){
        if(nums[i-1]+1==nums[i]){
            sum+=nums[i];
        }
        else break;
      }
      HashSet<Integer> set=new HashSet<>();
      for(int ele:nums) set.add(ele);
      int min=arr[0];
      int max=arr[n-1];
      if(sum>max) return sum;
      for(int j=min;j<=max;j++){
        if(!set.contains(j)&& j>=sum){
            return j;
        }
      }  
      return max+1;
    }
}