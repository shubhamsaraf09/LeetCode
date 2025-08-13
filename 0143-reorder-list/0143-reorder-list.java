/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode node=head;
        //List<ListNode> list=new ArrayList<>();
        Deque<ListNode> stack=new LinkedList<>();
        while(node!=null){
            stack.offerLast(node);
            node=node.next;
        }
        ListNode ans=head;
        
        stack.pollFirst();
        boolean fromback=true;
        while(!stack.isEmpty()){
            ans.next=fromback?stack.pollLast():stack.pollFirst();
            ans=ans.next;
            fromback=!fromback;
        }
        ans.next=null;
    }
}