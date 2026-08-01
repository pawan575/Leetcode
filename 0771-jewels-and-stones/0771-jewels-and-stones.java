class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char ch : stones.toCharArray())
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        // int ans = 0;
        // for (int i = 0; i < jewels.length(); i++) {
        //     char ch = jewels.charAt(i);
        //     if (map.containsKey(ch)) {
        //         ans += map.get(ch);
        //     }
        // }
        int[] freq=new int[200];
        for(char ch: stones.toCharArray()) freq[ch-'A']++;
        int ans=0;
        for(char ch:jewels.toCharArray()) ans+=freq[ch-'A'];
        return ans;
    }
}