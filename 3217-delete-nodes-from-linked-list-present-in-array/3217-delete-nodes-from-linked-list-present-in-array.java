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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ArrayList<Integer> arr=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        HashSet<Integer> set=new HashSet<>();
        for(int ele: nums) set.add(ele);
        ArrayList<Integer> ans= new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            if(!set.contains(arr.get(i))) ans.add(arr.get(i));
        }
        ListNode dummy=new ListNode(-1);
        ListNode p=dummy;
        for(int i=0;i<ans.size();i++){
            ListNode q=new ListNode(ans.get(i));
            p.next=q;
            p=p.next;
        }
        return dummy.next;
    }
}