// Problem: Middle of the Linked List
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
    public ListNode middleNode(ListNode head) {
        if(head==null) return head;
        int ans = 0;
        ListNode l = head;
        int count = 0;
        while(l!=null){
            count++;
            l = l.next;
        }
        if(count%2==1){
            count/=2;
            while(count>0){
                head=head.next;
                count--;
            }
        }
        else{
            count/=2;
            while(count>0){
                head=head.next;
                count--;
            }
        }
        return head;
    }
}