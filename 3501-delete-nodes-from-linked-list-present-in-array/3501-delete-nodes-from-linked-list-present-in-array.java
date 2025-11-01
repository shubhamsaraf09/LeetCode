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
        List<Integer> list=new ArrayList<>();
        while(head!=null){
            if(!set.contains(head.val))
            list.add(head.val);
            head=head.next;
        }
        ListNode l=new ListNode(0);
        ListNode ans=l;
        
        for(int i=0;i<list.size();i++){
            l.next=new ListNode(list.get(i));
            l=l.next;
        }
        return ans.next;
    }
}