class Solution {
    public int[] findErrorNums(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        for (int i = 1; i <= arr.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) != 1) {
                    ans[0] = i;
                }
            } else {
                ans[1] = i;
            }
        }
        return ans;
    }
}