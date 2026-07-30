class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int[] ans = new int[friends.length];
        int k = 0;
        for (int i = 0; i < order.length; i++) {
            int j = 0;
            while (j < friends.length && order[i] != friends[j]) {
                j++;
            }
            if (j < friends.length && order[i] == friends[j]) {
                ans[k++] = order[i];
            }
        }
        return ans;
    }
}