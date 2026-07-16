class Solution {
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                String sub=s.substring(i,j);
                int zero=0;
                int one=0;
                for(int l=0;l<sub.length();l++){
                    char ch=sub.charAt(l);
                    if(ch=='0') zero++;
                    else one++;
                }
                if(one<=k || zero<=k) count++;
            }
        }
        return count;
    }
}