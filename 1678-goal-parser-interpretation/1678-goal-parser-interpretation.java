class Solution {
    public String interpret(String command) {
        StringBuilder ans=new StringBuilder();
     
        if(Character.isLetter(command.charAt(0))) ans.append(command.charAt(0));
        for(int i=1;i<command.length();i++){
            char ch1=command.charAt(i-1);
            char ch2=command.charAt(i);
            if(ch1=='(' && ch2==')') ans.append('o');
            else{
                if(Character.isLetter(ch2)) ans.append(ch2);
            }
        }
        return ans.toString();
    }
}