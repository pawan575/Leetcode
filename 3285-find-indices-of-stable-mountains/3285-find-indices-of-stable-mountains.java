class Solution {
    public List<Integer> stableMountains(int[] h, int threshold) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<h.length;i++){
            if(h[i-1]>threshold){
                ans.add(i);
            }
        }
        return ans;
    }
}