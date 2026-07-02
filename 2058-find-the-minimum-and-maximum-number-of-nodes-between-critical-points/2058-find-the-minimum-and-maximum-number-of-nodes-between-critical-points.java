/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
     int[] ans=new int[2];
     if(head.next.next==null){
        ans[0]=-1;
        ans[1]=-1;
        return ans;
     }
     ArrayList<Integer> arr=new ArrayList<>();
     ListNode temp=head;
     ListNode slow=head.next;
     ListNode fast=slow.next;
       int i = 1; 

        while (fast != null) {

            if (slow.val > temp.val && slow.val > fast.val)
                arr.add(i);

            if (slow.val < temp.val && slow.val < fast.val)
                arr.add(i);

            temp = temp.next;
            slow = slow.next;
            fast = fast.next;
            i++;
        }
     if(arr.size()<2){
        ans[0]=-1;
        ans[1]=-1;
        return ans;
     }
   int min = Integer.MAX_VALUE;

        for (int j = 1; j < arr.size(); j++) {
            min = Math.min(min, arr.get(j) - arr.get(j - 1));
        }

        ans[0] = min;
        ans[1] = arr.get(arr.size() - 1) - arr.get(0);

        return ans;


    }
}