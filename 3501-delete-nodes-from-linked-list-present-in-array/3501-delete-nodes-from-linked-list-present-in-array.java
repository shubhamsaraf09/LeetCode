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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set=new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        ListNode l=new ListNode(0);
        ListNode ans=l;
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            if(!set.contains(head.val)){
                l.next=new ListNode(head.val);
            l=l.next;
            }   
            head=head.next;
        }
        return ans.next;
    }
}