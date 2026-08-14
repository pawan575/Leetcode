class Solution {
    public int maximumLengthSubstring(String s) {
        int maxLen=0;
        for(int i=0;i<s.length();i++){
            HashMap<Character,Integer> map=new HashMap<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)<=2){
                    maxLen=Math.max(maxLen,j-i+1);
                }
                else break;
            }
        }
        return maxLen;
    }
}