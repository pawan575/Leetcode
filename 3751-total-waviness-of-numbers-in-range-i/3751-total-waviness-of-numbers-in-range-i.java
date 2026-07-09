class Solution {
    public int count(int n){
        String s=String.valueOf(n);
        int len=s.length();
        if(len<=2) return 0;
        int count=0;
        for(int i=2;i<len;i++){
            int x=s.charAt(i-2)-'0';
            int y=s.charAt(i-1)-'0';
            int z=s.charAt(i)-'0';
            if(y>x && y>z) count++;
            if(y<x && y<z) count++;
        }
        return count;
    }
    public int totalWaviness(int num1, int num2) {
        int ans=0;
        for(int i=num1;i<=num2;i++){
            ans+=count(i);
        }
        return ans;
    }
}