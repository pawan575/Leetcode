class Solution {
    public int countValidPrefixes(String s) {
     int count=0;
     int zero=0;
     int one=0;
     for(int i=0;i<s.length();i++){
        int val=s.charAt(i)-'0';
        if(val==0) zero++;
        else one++;
        if(zero+1==one || one+1==zero) count++;
        if(zero==one) count++;
     }   
     return count;
    }
}