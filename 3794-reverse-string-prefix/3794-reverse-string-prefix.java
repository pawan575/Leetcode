class Solution {
    public String reversePrefix(String s, int k) {
        String ans="";
        StringBuilder rev=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
         if(i<k){
            rev.append(ch);
         }else{
            ans+=ch;
         }   
        }
      StringBuilder res=new StringBuilder(rev.reverse().toString());
      res.append(ans);
      return res.toString();  
    }
}