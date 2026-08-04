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
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode crNxt=null;
        while(curr!=null){
            crNxt=curr.next;
            curr.next=prev;
            prev=curr;
            curr=crNxt;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
     ListNode temp=reverse(head);
     ListNode dummy=new ListNode(-1);
     ListNode p=dummy;
    int carry=0;
     while(temp!=null){
       
        int a=2*temp.val+carry;
        if(a>=10){
            ListNode q=new ListNode(a%10);
            carry=1;
             p.next=q;
        }
        else{
            ListNode q=new ListNode(a);
            carry=0;
             p.next=q;
        }
       
        p=p.next;
        temp=temp.next;
     }
     if(carry==1){
        ListNode q=new ListNode(1);
        p.next=q;
        p=p.next;
     }
     ListNode r=reverse(dummy.next);
     return r;


    }
}