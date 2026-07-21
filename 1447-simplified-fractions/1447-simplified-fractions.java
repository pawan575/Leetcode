class Solution {
    public int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public List<String> simplifiedFractions(int n) {
        List<String> ans=new ArrayList<>();
        for(int i=1;i<n;i++){
            
            for(int j=i+1;j<=n;j++){
                if(gcd(i,j)==1){
                   StringBuilder str=new StringBuilder();
                    str.append(i);
                    str.append('/');
                    str.append(j);

                    ans.add(str.toString());
                }
            }
        }
        return ans;
    }
}