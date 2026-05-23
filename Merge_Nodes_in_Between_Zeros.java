// Problem: Merge Nodes in Between Zeros
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
    public ListNode mergeNodes(ListNode head) {
        int sum = 0;
        ListNode ans = new ListNode();
        head=head.next;
        ListNode res = ans;
        while(head!=null){
            sum+=head.val;
            if(head.val==0){
                ans.val = sum;
                sum = 0;
                if(head.next!=null){
                    ans.next = new ListNode();
                    ans = ans.next;
                }
            }
            head=head.next;
        }
        return res;
    }
}