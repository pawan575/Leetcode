class Solution {
   
    public int arraySign(int[] nums) {
    boolean isZero=false;
    int negCount=0;
    for(int ele:nums){
        if(ele==0) return 0;
        if(ele<0) negCount++;
    }   
    if(negCount%2==0) return 1;
    return -1; 
    }
}