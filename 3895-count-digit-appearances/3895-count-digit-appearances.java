class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while(n>0){
                int ld=n%10;
                map.put(ld,map.getOrDefault(ld,0)+1);
                n/=10;
            }
        }
        if(map.containsKey(digit)){
            count=map.get(digit);
        }
        return count;
    }
}