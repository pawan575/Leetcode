class Solution {
    public int sumOfMultiples(int n) {
        int sum=0;
        int aSum=0;
        int bSum=0;
        int cSum=0;
        int common=0;
        for(int i=1;i<=n;i++){
            if(i%3==0) sum+=i;
            if(i%5==0) sum+=i;
            if(i%7==0) sum+=i;
            if(i%15==0) aSum+=i;
            if(i%35==0) bSum+=i;
            if(i%21==0) cSum+=i;
            if(i%105==0) common+=i;

        }
        return sum-(aSum+bSum+cSum)+common;
    }
}