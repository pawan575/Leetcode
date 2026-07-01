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
    public ListNode removeElements(ListNode head, int val) {
       ListNode dummy=new ListNode(-1);
       ListNode tail=dummy;
       ListNode temp=head;
       while(temp!=null){
        if( temp.val==val){
            temp=temp.next;
        }
        else{
        tail.next=temp;
        tail=temp;
        temp=temp.next;
        }
       }
       tail.next=temp;

       return dummy.next;
    }
}