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
    int ans=0;
    public int getDecimalValue(ListNode head) {
    Stack<Integer> stack=new Stack<>();
    while(head!=null){
        stack.push(head.val);
        head=head.next;
    }    
    int i=0;
    while(!stack.isEmpty()){
        int num=stack.pop();
        if(num==1){
            ans+=Math.pow(2,i);
        }
        i++;
    }
    return ans;
    }   
}