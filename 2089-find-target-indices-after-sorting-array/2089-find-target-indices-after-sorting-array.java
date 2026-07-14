class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        int n=arr.length;
        List<Integer> ans=new ArrayList<>();
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<n;i++){
            if(temp[i]==target) ans.add(i);
        }
        return ans;
    }
}