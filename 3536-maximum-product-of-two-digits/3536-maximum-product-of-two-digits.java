class Solution {
    public int maxProduct(int n) {
        ArrayList<Integer> ans=new ArrayList<>();
        while(n>0){
            ans.add(n%10);
            n/=10;
        }
        int max=Integer.MIN_VALUE;
        int secMax=Integer.MIN_VALUE;
        for(int i=0;i<ans.size();i++){
            if(ans.get(i)>=max){
                secMax=max;
                max=ans.get(i);
                
            }
            else if(ans.get(i)>=secMax && ans.get(i)!=max){
                secMax=ans.get(i);
            }
            
        }
        return max*secMax;
    }
}