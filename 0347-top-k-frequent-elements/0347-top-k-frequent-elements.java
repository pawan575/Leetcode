class Solution {
    static class Frequency implements Comparable<Frequency>{
        int ele;
        int freq;
        public Frequency(int ele,int freq){
            this.ele=ele;
            this.freq=freq;
        }

        @Override
        public int compareTo(Frequency f){
            return f.freq-this.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans=new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele: nums){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<Frequency> pq=new PriorityQueue<>();
        for(int x:map.keySet()){
            pq.add(new Frequency(x,map.get(x)));
        }
        for(int i=0;i<k;i++){
            Frequency fq=pq.remove();
            ans[i]=fq.ele;
        }  
        return ans; 
        
    }
}