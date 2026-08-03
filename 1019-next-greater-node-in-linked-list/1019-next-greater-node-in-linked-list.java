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
    public int[] nextLargerNodes(ListNode head) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        temp=head;
        int[] ans=new int[len];
        for(int i=0;i<len;i++){
            ans[i]=temp.val;
            temp=temp.next;
        }
        Stack<Integer> st= new Stack<>();
        int[] nge=new int[len];
        for(int i=len-1;i>=0;i--){
            while(!st.empty() && st.peek()<=ans[i]){
                st.pop();
            }
            if(st.empty()) nge[i]=0;
            else nge[i]=st.peek();
            st.push(ans[i]);
        }
        return nge;
    }
}