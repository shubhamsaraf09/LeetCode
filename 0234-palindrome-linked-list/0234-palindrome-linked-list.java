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
    public boolean isPalindrome(ListNode head) {
        ListNode m=mid(head);
        ListNode prev=null;
        ListNode pres=m;
        ListNode next=m.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null) next=next.next;
        }
        while(prev!=null && head!=null){
            if(prev.val!=head.val) return false;
            prev=prev.next;
            head=head.next;
        }
        return true;
    }
    ListNode mid(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        if(fast.next!=null) slow=slow.next;
        return slow;
    }
}