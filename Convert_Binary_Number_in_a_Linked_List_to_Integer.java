// Problem: Convert Binary Number in a Linked List to Integer
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
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;
        int ans = 0;
        ListNode l = head;
        int count = 0;
        while(l!=null){
            count++;
            l = l.next;
        }
        int i = count-1;
        while(head!=null){
            int temp = head.val;
            ans = ans+ (int)(Math.pow(2,i--)*temp);
            head = head.next; 
        }
        return ans;
        
    }
}