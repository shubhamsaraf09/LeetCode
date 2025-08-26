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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int[] index={0};
        return helper(inorder,preorder,0,preorder.length-1,map,index);
    }

    TreeNode helper(int[] inorder,int[] preorder,int l,int r,HashMap<Integer,Integer> map,int[] index){
        if(l>r) return null;
        int current=preorder[index[0]];
        index[0]++;
        int currindex=map.get(current);
        TreeNode node=new TreeNode(current);
        node.left=helper(inorder,preorder,l,currindex-1,map,index);
        node.right=helper(inorder,preorder,currindex+1,r,map,index);

        return node;
    }
}