class Solution {
    public void wiggleSort(int[] nums) {
int n = nums.length;

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int num : nums) {
            pq.offer(num);
        }

        int[] temp = new int[n];

        for (int i = 1; i < n; i += 2) {
            temp[i] = pq.poll();
        }

        for (int i = 0; i < n; i += 2) {
            temp[i] = pq.poll();
        }

        System.arraycopy(temp, 0, nums, 0, n); 
    }
}