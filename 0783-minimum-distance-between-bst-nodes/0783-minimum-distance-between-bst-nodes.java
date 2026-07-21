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
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> arr= new ArrayList<>();
      inorder(root,arr);
      int min=Integer.MAX_VALUE;
      for(int i=0;i<arr.size();i++){
        for(int j=i+1;j<arr.size();j++){
            int diff=Math.abs(arr.get(i)-arr.get(j));
            min=Math.min(diff,min);
        }
      }
      return min;
    }
}