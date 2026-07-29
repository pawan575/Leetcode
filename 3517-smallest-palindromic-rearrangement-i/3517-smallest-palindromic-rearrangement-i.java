class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1) return s;
        int[] freq=new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i]/2;j++){
                sb.append((char)(i+'a'));
            }
            
        }
        int middle=-1;
        for(int j=0;j<26;j++){
            if(freq[j]%2==1){
                middle=j;
                break;
            }
        }
        
        StringBuilder ans=new StringBuilder(sb.toString());
        if(middle!=-1) ans.append((char)(middle+'a'));
            // int n=sb.toString().length();
            // ans.delete(middle,n);
        
       ans.append(new StringBuilder(sb).reverse());
        // sb.append(sb.toString().reverse());
        return ans.toString();
    }
}