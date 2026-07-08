class Solution {
    public boolean isPrime(int num){
        if(num<=1) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public int[] closestPrimes(int left, int right) {
        int[] ans=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isPrime(i)) arr.add(i);
        }
        Collections.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int j=1;j<arr.size();j++){
            int diff=arr.get(j)-arr.get(j-1);
            if(diff<minDiff){
                minDiff=diff;
                ans[0]=arr.get(j-1);
                ans[1]=arr.get(j);
            }
        }
        return ans;

    }
}