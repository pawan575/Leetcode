class Solution {
    public int minSwaps(String s) {
        int count0=0;
        int count1=0;
        int n=s.length();
        for(char ch:s.toCharArray()){
            if(ch=='1') count1++;
            else count0++;
        }
        if(Math.abs(count1-count0)>1) return -1;
        int miss0=0;
        int miss1=0;
        for(int i=0;i<s.length();i=i+2){
            char ch=s.charAt(i);
            if(ch=='0') miss1++;
            else miss0++;
        }
         return count0==count1 ? Math.min(miss0,miss1) : count0>count1 ? miss0:miss1;
    }
}