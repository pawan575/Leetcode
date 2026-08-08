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
    public void inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null) return ;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public TreeNode buildTree(ArrayList<Integer> arr,int idx){
        if(idx>=arr.size()) return null;
        TreeNode a=new TreeNode(arr.get(idx));
        a.left=null;
        a.right= buildTree(arr,idx+1);
        return a; 
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return buildTree(arr,0);
       
    }
}