class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();
        String base="123456789";
        for(int len=2;len<=9;len++){
            for(int strt=0;strt+len<=9;strt++){
                String sub=base.substring(strt,strt+len);
                int num=Integer.parseInt(sub);
                if(num>=low && num<=high){
                    ans.add(num);
                }
            }
        }
        return ans;
    }
}