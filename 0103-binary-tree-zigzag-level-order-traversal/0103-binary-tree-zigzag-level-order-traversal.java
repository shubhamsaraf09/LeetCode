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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null) return list;
        Deque<TreeNode> q=new LinkedList<>();
        q.offerFirst(root);
        boolean reverse=true;
        while(!q.isEmpty()){
            int level=q.size();
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<level;i++){
                if(reverse){
                    TreeNode curr=q.pollFirst();
                    l.add(curr.val);
                    if(curr.left!=null){
                        q.offerLast(curr.left);
                    }
                    if(curr.right!=null){
                        q.offerLast(curr.right);
                    }
                    
                }
                else{
                    TreeNode curr=q.pollLast();
                    l.add(curr.val);
                    if(curr.right!=null){
                        q.offerFirst(curr.right);
                    }
                    if(curr.left!=null){
                        q.offerFirst(curr.left);
                    }
                }
                
            }
            reverse=!reverse;
            list.add(l);
        }
        return list;
    }
}