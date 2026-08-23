class Solution {
    public boolean isPalindromic(String s) {
       StringBuilder ans=new StringBuilder();
       for(int i=0;i<s.length();i++){
        int val=(int)(s.charAt(i));
        String binary = String.format("%8s", Integer.toBinaryString(val))
                       .replace(' ', '0');
        ans.append(binary);
       }
       StringBuilder str=new StringBuilder(ans.toString());
        int lo=0;
        int hi=str.length()-1;
        while(lo<hi){
            if(str.charAt(lo)!=str.charAt(hi)) return false;
            lo++;
            hi--;
        }
        return true;
    }
}