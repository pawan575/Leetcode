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
    public int maxValue(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(maxValue(root.left),maxValue(root.right)));
    }
    public int countDominantNodes(TreeNode root) {
        int count=0;
        if(root==null) return 0;
        count+=countDominantNodes(root.left);
        int val=root.val;
        if(val>=maxValue(root)) count++;
       count+= countDominantNodes( root.right);
        return count;
    }
}