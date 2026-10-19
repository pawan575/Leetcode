class Solution {
    static class Frequency implements Comparable<Frequency>{
        String s;
        int freq;
        public Frequency(String s,int freq){
            this.s=s;
            this.freq=freq;
        }
        @Override
        public int compareTo(Frequency f){
             if (f.freq != this.freq) {
                  return f.freq - this.freq;  // Higher frequency first
                    }
            return this.s.compareTo(f.s);   // Alphabetical order
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }
        PriorityQueue<Frequency> pq=new PriorityQueue<>();
        for(String str:map.keySet()){
            pq.add(new Frequency(str,map.get(str)));
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<k;i++){
            Frequency fq=pq.remove();
            ans.add(fq.s);
        }
        return ans;
    }
}