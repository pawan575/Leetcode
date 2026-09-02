class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>freq=new HashMap<>();
        int maxFreq=0,ansKey=-1;
        for(int el:nums){
            if(!freq.containsKey(el)){
                freq.put(el,1);
            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        }

        for(var el: freq.entrySet()){
            if(el.getValue() > maxFreq){
                maxFreq=el.getValue();
                ansKey=el.getKey();
            }
        }

        return ansKey;

    }
}