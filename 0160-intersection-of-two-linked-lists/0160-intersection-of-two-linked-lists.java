/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // ListNode tempA=headA;
        // int a=0;
        // while(tempA!=null){
        //     tempA=tempA.next;
        //       a++;
        // }
        // ListNode tempB=headB;
        // int b=0;
        // while(tempB!=null){
        //     tempB=tempB.next;
        //     b++;
        // }
        //   tempA=headA;
        //    tempB=headB;
        // if(a>b){
        //     for(int i=1;i<=(a-b);i++){
        //         tempA=tempA.next;
        //     }
        // }
        // else{
        //     for(int i=1;i<=(b-a);i++){
        //         tempB=tempB.next;
        //     }
        // }
        // while(tempA!=tempB){
        //     tempA=tempA.next;
        //     tempB=tempB.next;
        // }
        // return tempA;

        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=p2){
            if(p1==null) p1=headB;
            else p1=p1.next;
            if(p2==null) p2=headA;
            else p2=p2.next;
        }
        return p2;
    }
}