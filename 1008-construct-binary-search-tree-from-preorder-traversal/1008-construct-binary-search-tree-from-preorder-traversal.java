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
    public TreeNode insertBST(TreeNode root,int data){
        if(root==null) return new TreeNode(data);
        if(root.val>data){
            root.left=insertBST(root.left,data);
        }
        else{
            root.right=insertBST(root.right,data);
        }
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root=null;
        for(int ele:preorder){
            root=insertBST(root,ele);
        }
        return root;
    }
}