class Solution {
    public String defangIPaddr(String address) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if(ch!='.') ans.append(ch);
            else {
                ans.append('[');
                ans.append('.');
                ans.append(']');
            }
        }
        return ans.toString();
    }
}