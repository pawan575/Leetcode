class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length==2)return true;
        int cd=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            int d=arr[i]-arr[i-1];
            if(d!=cd) return false;
        }
        return true;
    }
}