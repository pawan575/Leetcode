class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int maxCoin=0;
        int i=0;
        int j=piles.length-2;
        int k=piles.length-1;
        while(i<j){
            maxCoin+=piles[j];
            i++;
            k=k-2;
            j=j-2;
        }
        return maxCoin;
    }
}