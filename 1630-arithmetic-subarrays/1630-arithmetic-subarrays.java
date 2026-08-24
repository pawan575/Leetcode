class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int m=l.length;
        List<Boolean> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            int x=l[i];
            int y=r[i];
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=x;j<=y;j++){
                arr.add(nums[j]);
            }
            Collections.sort(arr);
            int d=arr.get(1)-arr.get(0);
            boolean isSorted=true;
            for(int k=1;k<arr.size();k++){
                int d1=arr.get(k)-arr.get(k-1);
                if(d1!=d){
                    isSorted=false;
                    break;
                }
            }
            ans.add(isSorted);
        }
        return ans;
    }
}