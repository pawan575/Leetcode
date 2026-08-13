class Solution {
    public boolean isPalindrome(int n,int base){
        StringBuilder s=new StringBuilder();
        while(n>0){
            s.append(n%base);
            n=n/base;
        }
        String sb=s.toString();
        return sb.equals(s.reverse().toString());
    }
    public boolean isStrictlyPalindromic(int n) {
        int i=2;
        while(i<=n-2){
            if(!isPalindrome(n,i)) return false;
            i++;
        }
        return true;
    }
}