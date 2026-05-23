// Problem: Insert Greatest Common Divisors in Linked List
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ans = head;
        while(head.next!=null){
            ListNode temp = new ListNode();
            int gcd = eucledian(head.val, head.next.val);
            temp.val = gcd;
            temp.next = head.next;
            head.next = temp;
            head= head.next.next;
        }
        return ans;
    }

    public int eucledian(int a, int b){
        if(a==0) return b;
        return eucledian(b%a,a);
    }
}