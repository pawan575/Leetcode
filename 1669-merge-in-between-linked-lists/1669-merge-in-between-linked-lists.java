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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode head1=list1;
        ListNode head2=list2;
        int count=0;
        ListNode temp=head1;
        while(count<a-1){
            temp=temp.next;
            count++;
        }
        ListNode c=temp;
        count=0;
        while(count<(b-a+1)){
            temp=temp.next;
            count++;
        }
        ListNode d=temp;
        ListNode e=temp.next;
        ListNode curr=head2;
        while(curr.next!=null){
            curr=curr.next;
        }
        c.next=head2;
        curr.next=e;
        return head1;

    }
}