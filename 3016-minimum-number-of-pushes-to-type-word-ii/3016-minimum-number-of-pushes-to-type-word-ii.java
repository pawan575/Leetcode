class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(int i=0;i<word.length();i++){
            freq[word.charAt(i)-'a']++;
        }
        Arrays.sort(freq);
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char ch : word.toCharArray())
        //     map.put(ch, map.getOrDefault(ch, 0) + 1);
        int count = 0;
        int pushes = 0;
        for (int i=freq.length-1;i>=0;i--) {
            if(freq[i]>0){
                if( count<8){
                    pushes+=freq[i]*1;
                }
                else if( count<16){
                    pushes+=freq[i]*2;
                }
                else if(count<24){
                    pushes+=freq[i]*3;
                }
                else{
                    pushes+=freq[i]*4;
                }
                
            }else {
                break;
            }
            count++;
           
        }
        return pushes;
    }
}