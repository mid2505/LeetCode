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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode i = head; i!=null; i=i.next){
            pq.add(i.val);
        }
        for(ListNode i=head;i!=null;i=i.next){
            i.val=pq.poll();
        }
        return head;
    }
}