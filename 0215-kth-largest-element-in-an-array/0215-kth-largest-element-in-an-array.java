class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap=new PriorityQueue<>();
        for(int ele:nums){
            heap.add(ele);
            if(heap.size()>k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}