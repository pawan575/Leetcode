class Solution {
    public String truncateSentence(String s, int k) {
       char [] arr=s.toCharArray();
       StringBuilder ans=new StringBuilder();
       int count=0;
       for(int i=0;i<arr.length;i++){
        char ch=arr[i];
        if(ch==' ') count++;
        ans.append(ch);
        if(count==k) break;
       }
       
       return ans.toString().trim();
    }
}