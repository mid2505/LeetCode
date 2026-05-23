// Problem: Swap Nodes in Pairs
// Language: java

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
    public ListNode swapPairs(ListNode head) {
        ListNode h = head;
        while(h!=null && h.next!=null){
            int temp = h.val;
            h.val = h.next.val;
            h.next.val = temp;
            h = h.next.next;
        } 
        return head;
    }
}