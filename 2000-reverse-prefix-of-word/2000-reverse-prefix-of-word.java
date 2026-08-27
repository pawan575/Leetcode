class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.indexOf(ch)==-1) return word;
        StringBuilder start=new StringBuilder();
        int idx=0;
        while(idx<word.length()){
            char ch1=word.charAt(idx++);
            if(ch1!=ch){
                start.append(ch1);
            }
            else {
                start.append(ch1);
                break;
            }
        }
        StringBuilder ans=new StringBuilder(start.reverse().toString());
        while(idx<word.length()){
             char ch1=word.charAt(idx++);
             ans.append(ch1);
        }
        return ans.toString();

    }
}