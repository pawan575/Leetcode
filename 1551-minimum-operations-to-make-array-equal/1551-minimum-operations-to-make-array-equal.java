class Solution {
    public int minOperations(int n) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=2*i+1;
        }
        int med=(arr[0]+arr[n-1])/2;
        int count=0;
        int lo=0;
        int hi=n-1;
        while(lo<hi){
            while(arr[lo]!=med){
                arr[lo]++;
                arr[hi]--;
                count++;
            }
            lo++;
            hi--;
        }
        return count;
    }
}