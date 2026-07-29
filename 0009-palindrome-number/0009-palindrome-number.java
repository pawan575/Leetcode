class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int sum=0;
        while(x>0){
            int ld=x%10;
            sum=sum*10+ld;
            x/=10;
        }
        if(temp==sum) return true;
        else{
            return false;
        }
    }
}