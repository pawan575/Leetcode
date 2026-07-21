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
class quad{
    int max;
    int min;
    int sum;
    boolean isBST;
    quad(int max, int min,int sum,boolean isBST){
        this.max=max;
        this.min=min;
        this.sum=sum;
        this.isBST=isBST;
    }
}
class Solution {
    int ans=0;
    public int maxSumBST(TreeNode root) {
        maxMin(root);
        return ans;
    }
    quad maxMin(TreeNode root){
        if(root==null) return new quad(Integer.MIN_VALUE,Integer.MAX_VALUE,0,true);
        quad left = maxMin(root.left);
        quad right = maxMin(root.right);
           if (left.isBST && right.isBST &&
            left.max < root.val &&
            right.min > root.val) {

            int sum = root.val + left.sum + right.sum;
            ans = Math.max(ans, sum);

            return new quad(
                Math.max(root.val, right.max),
                Math.min(root.val, left.min),
                sum,
                true
            );
        }

        return new quad(
            Integer.MAX_VALUE,
            Integer.MIN_VALUE,
            0,
            false
        );
    }
}