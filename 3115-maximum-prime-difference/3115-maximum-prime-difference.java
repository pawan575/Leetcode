class Solution {
    public boolean isPrime(int n){
        if(n==1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public int maximumPrimeDifference(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])) arr.add(i);
        }
        int maxDist=0;
        if(arr.size()<=1) return 0;
        return arr.get(arr.size()-1)-arr.get(0);
        // for(int j=0;j<arr.size();j++){
        //     for(int k=j+1;k<arr.size();k++){
        //         int dist=arr.get(k)-arr.get(j);
        //         maxDist=Math.max(dist,maxDist);
        //     }
        // }
        // return maxDist;


    }
}