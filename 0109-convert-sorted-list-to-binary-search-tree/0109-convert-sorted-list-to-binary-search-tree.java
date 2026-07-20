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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {   
     public TreeNode convert(int[] arr,int lo,int hi){
        if(lo>hi) return null;
        int mid=(lo+hi)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=convert(arr,lo,mid-1);
        root.right=convert(arr,mid+1,hi);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
            
        }
        int [] arr=new int[len];
        temp=head;
        int i=0;
        while(temp!=null){
            arr[i++]=temp.val;
            temp=temp.next;
          
        }
        return convert(arr,0,len-1);


    }
}