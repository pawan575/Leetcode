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
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        for(int i=0;i<arr.size();i++){
            int rem=k-arr.get(i);
            for(int j=0;j<arr.size();j++){
                if(i!=j && arr.get(j)==rem) return true;
            }
        }
        return false;
    }
}