class Solution {
    public int totalNumbers(int[] digits) {
        int count=0;
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int ele:digits) map.put(ele,map.getOrDefault(ele,0)+1);
      for(int i=100;i<=998;i=i+2){
        int n=i;
        boolean flag=true;
        HashMap<Integer,Integer> p=new HashMap<>();
        while(n!=0){
            int ld=n%10;
            p.put(ld,p.getOrDefault(ld,0)+1);
            n/=10;
        }
        for(int key:p.keySet()){
            if(map.containsKey(key)){
               if(map.get(key)<p.get(key)){
                flag=false;
                break;
               } 
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag) count++;
      }
      return count;
    }
}