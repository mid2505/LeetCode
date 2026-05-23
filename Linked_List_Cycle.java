// Problem: Linked List Cycle
// Language: java

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;
        Set<ListNode> s = new HashSet<>();
        while(head!=null){
            if(!s.contains(head)) s.add(head);
            else return true;
            head = head.next;
        }
        return false;
    }
}