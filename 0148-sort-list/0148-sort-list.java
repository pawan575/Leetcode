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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        ListNode dummy=new ListNode(-1);
        ListNode right=dummy;
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++){
            ListNode j=new ListNode(arr.get(i));
            right.next=j;
            right=right.next;
        }
        return dummy.next;
    }
}