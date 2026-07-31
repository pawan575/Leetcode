class Solution {
    public String mapWordWeights(String[] s, int[] w) {
        StringBuilder ans=new StringBuilder();
        int n=w.length-1;
        for (int i = 0; i < s.length; i++) {
            String str = s[i];
            int wght = 0;
            int j = 0;
            while (j < str.length()) {
                int val = str.charAt(j++) - 'a';
                wght += w[val];
            }
            wght=wght%26;
             char ch=(char)('z'-wght);
             ans.append(ch);

        }
        return ans.toString();

    }

}