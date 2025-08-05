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

    List<Integer> list=new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int sum=list.get(1)-list.get(0);
        for(int i=2;i<list.size();i++){
            int val=list.get(i)-list.get(i-1);
            if(val<sum) sum=val;
        }
        return sum;
    }

    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
}