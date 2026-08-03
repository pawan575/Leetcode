class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        HashSet<Integer> set= new HashSet<>();
        for(int ele: candyType) set.add(ele);
        int max=n/2;
        if(max<=set.size()) return max;
        else return set.size();
    }
}