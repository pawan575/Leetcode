class Solution {
    public int calPoints(String[] operations) {
        List<Integer> ans=new ArrayList<>();
        for(String op:operations){
            if(op.equals("C")){
                ans.remove(ans.size()-1);
            }
            else if(op.equals("D")){
                int a=2*ans.get(ans.size()-1);
                ans.add(a);
            }
            else if(op.equals("+")){
                int a=ans.get(ans.size()-1)+ans.get(ans.size()-2);
                ans.add(a);
            }
            else{
                ans.add(Integer.parseInt(op));
            }
        }
        int sum=0;
        for(int i=0;i<ans.size();i++){
            sum+=ans.get(i);
        }
        return sum;

    }
}