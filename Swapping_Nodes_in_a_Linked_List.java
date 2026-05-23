// Problem: Swapping Nodes in a Linked List
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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode h = head;
        while(h!=null){
            count++;
            h = h.next;
        }
        int frl = count-k+1;
        System.out.println(count);
        int idx = 1;
        int t1=0;
        int t2=0;
        h = head;
        while(h!=null){
            if(idx==frl){
                t1 = h.val;
            }
            h=h.next;
            idx++;
        }
        idx = 1;
        h = head;
        while(h!=null){
            if(idx==k){
                t2 = h.val;
            }
            h=h.next;
            idx++;
        }
        idx = 1;
        h = head;
        while(h!=null){
            if(idx==k) h.val = t1;
            if(idx==frl) h.val = t2;
            h = h.next;
            idx++;
        }
        return head;
    }
}