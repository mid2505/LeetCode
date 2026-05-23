// Problem: Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = head;
        ListNode a = head;
        int count = 1;
        while(head.next!=null){
            count++;
            head=head.next;
        }
        System.out.println(count);

        if(count==n) return ans.next;
        if(count==1 && n==1){
            return head.next;
        }

        int i=1;
        count=count-n;
        while(i<count){
            if(a.next!=null) a=a.next;
            i++;
        }
        if(a.next.next!=null) a.next = a.next.next;
        else a.next = null;
        return ans;
    }
}