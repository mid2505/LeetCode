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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode newNode;
        ListNode ans = new ListNode(-1);
        ListNode finalAns = ans;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(ListNode i : lists){
            while(i!=null){
                pq.add(i.val);
                i=i.next;
            }
        }
        while (!pq.isEmpty()) {
            newNode = new ListNode(pq.poll());
            ans.next = newNode;
            ans = ans.next;
        }
        return finalAns.next;
    }
}