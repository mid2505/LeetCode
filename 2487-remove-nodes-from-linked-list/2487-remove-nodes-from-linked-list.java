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
    public ListNode removeNodes(ListNode head) {
        if(head.next==null) return head;
        ListNode prev = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        ListNode pre = prev;
        head = prev.next;
        while(head!=null){
            if(head.val>=pre.val){
                pre.next = head;
                pre = head;
            }
            head = head.next;
        }
        pre.next=null;
        head = prev;
        prev = null;
        cur = head;
        while(cur!=null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
}