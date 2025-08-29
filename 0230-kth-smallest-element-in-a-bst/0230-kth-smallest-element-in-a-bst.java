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
    int count=0;
    int ans=0;
    public int kthSmallest(TreeNode root, int k) {
        count=k;
        traversal(root);
        return ans;
    }
    void traversal(TreeNode root){
        if(root==null) return;
        traversal(root.left);
        count=count-1;
        if(count==0){
            ans=root.val;
            return;
        }
        traversal(root.right);
    }
}