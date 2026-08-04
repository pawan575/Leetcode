class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
       Set<Character> set= new HashSet<>();
       for(char ch:allowed.toCharArray()) set.add(ch);
       int count=0;
       for(int i=0;i<words.length;i++){
        String str=words[i];
        boolean found=true;
        int j=0;
        while(j<str.length()){
            char ch=str.charAt(j++);
            if(!set.contains(ch)){
                found=false;
                break;
            }
        }
        if(found) count++;
       }
       return count;
    }
}