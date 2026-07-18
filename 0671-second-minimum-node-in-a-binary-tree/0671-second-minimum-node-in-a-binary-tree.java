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
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        Collections.sort(arr);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.size();i++){
            set.add(arr.get(i));
        }
        if(set.size()<2) return -1;
        set.remove(arr.get(0));
        int ans=0;
        for(int i=1;i<arr.size();i++){
            if(set.contains(arr.get(i))){
                ans=arr.get(i);
                break;
            }
        }
        return ans;
    }
}