class Solution {
    public String sortVowels(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        for(char ch:s.toCharArray()){
            if("AEIOUaeiou".contains(String.valueOf(ch))) arr.add(ch);
        }
        Collections.sort(arr);
        StringBuilder ans=new StringBuilder();
        int i=0;
        for(char ch:s.toCharArray()){
           if("AEIOUaeiou".contains(String.valueOf(ch))) ans.append(arr.get(i++));
           else ans.append(ch); 
        }
        return ans.toString();
    }
}