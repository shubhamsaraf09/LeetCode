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

    //List<Integer> list=new ArrayList<>();
    int sum=Integer.MAX_VALUE;
    int prev=-1;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        // int sum=list.get(1)-list.get(0);
        // for(int i=2;i<list.size();i++){
        //     int val=list.get(i)-list.get(i-1);
        //     if(val<sum) sum=val;
        // }
         return sum;
    }

    void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        if(prev!=-1) sum=Math.min(sum,root.val-prev);
        prev=root.val;
        inorder(root.right);
    }
}