class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> set=new HashSet<>();
        for(int ele: friends) set.add(ele);
        int[] ans=new int[friends.length];
        int idx=0;
        for(int i=0;i<order.length;i++){
            if(set.contains(order[i])) ans[idx++]=order[i]; 
        }
        return ans;
    }
}