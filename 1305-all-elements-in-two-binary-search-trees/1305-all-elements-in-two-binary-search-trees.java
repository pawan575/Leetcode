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
    public void merge(ArrayList<Integer> arr1,ArrayList<Integer> arr2,List<Integer> ans){
        int i=0;
        int j=0;
        while(i<arr1.size() && j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                ans.add(arr1.get(i));
                i++;
            }
            else{
                ans.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            ans.add(arr1.get(i++));
        }
        while(j<arr2.size()){
            ans.add(arr2.get(j++));
        }
    }

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root1,arr1);
        inorder(root2,arr2);
        List<Integer> ans=new ArrayList<>();
        merge(arr1,arr2,ans);
        return ans;



    }
}