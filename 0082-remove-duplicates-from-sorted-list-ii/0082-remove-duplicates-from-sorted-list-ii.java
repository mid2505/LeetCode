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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode prev = new ListNode();
        ListNode ans = prev;
        ListNode cur = head;
        prev.next = cur;
        ListNode nextNode = cur.next;
        while(cur!=null && cur.next!=null){
            if(cur.val == cur.next.val){
                while(cur.next!=null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                prev.next = cur.next;
            }
            else{
                prev = prev.next;
            }
            cur = cur.next;
        }
        return ans.next;
    }
}