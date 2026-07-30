class Solution {
    public int minimumPushes(String word) {
        if(word.length()<=8) return word.length();
        int push=0;
        int n=word.length();
       int count=1;

        for(int i=0;i<n;i++){
            if(count<=8){
                push++;
               
            }
            else if(count>8 && count<=16){
                push+=2;
              
            }
            else if(count>16 && count<=24){
                push+=3;
                
            }
            else{
                push+=4;
            }
            count++;
        }
        return push;    
    }
}