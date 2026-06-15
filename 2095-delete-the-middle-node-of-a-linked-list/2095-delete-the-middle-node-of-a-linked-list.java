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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null) return head.next;
        ListNode prev = head;
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        boolean flag = true;
        while(fastPointer!=null && fastPointer.next!=null){
            if(flag){
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
                flag = false;
            }
            else{
                prev = prev.next;
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next.next;
            }
        }
        prev.next = prev.next.next;
        return head;
        //int target = slowPointer.val;

    }
}