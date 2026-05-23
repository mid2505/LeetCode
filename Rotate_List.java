// Problem: Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        
        ListNode l = head;
        ListNode ans = head;
        int count = 0;
        while(l!=null){
            count++;
            l = l.next;
        }

        k = k%count;
        if(k==0) return head;
        ListNode res;
        count-=k;
        int i = 0;
        while(i<count){
            if(head.next!=null) head = head.next;
            i++;
        }
        res = head;
        ListNode fin = res;
        while(res.next!=null){
            res = res.next;
        }
        res.next = ans;
        i = 0;
        while(i<count){
            res = res.next;
            i++;
        }
        res.next = null;
        return fin;
    }
}