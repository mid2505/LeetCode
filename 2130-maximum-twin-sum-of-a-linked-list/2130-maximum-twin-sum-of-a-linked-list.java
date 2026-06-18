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
    public int pairSum(ListNode head) {
        int max = Integer.MIN_VALUE;
        Stack<Integer> st = new Stack<>();
        ListNode trav = head;
        int count = 0;
        while(head!=null){
            count++;
            head = head.next;
        }
        head = trav;
        count = count>>1;
        for(int i=0;i<count;i++){
            st.push(head.val);
            head = head.next;
        }
        for(int i=count;head!=null;head=head.next){
            max = Math.max(max, st.pop() + head.val);
        }
        return max;
    }
}