// Problem: Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode(0);
        ListNode head = ans;
        if(l1==null) return l2;
        else if(l2==null) return l1;
        else{
            while(l1!=null && l2!=null){
                if(l1.val<l2.val){
                    ans.val = l1.val;                  
                    ans.next = new ListNode();
                    ans = ans.next;
                    l1 = l1.next;
                }
                else{
                    ans.val = l2.val;
                    ans.next = new ListNode();
                    ans = ans.next;
                    l2 = l2.next;
                }
            }
            while(l1!=null){
                ans.val = l1.val;
                if(l1.next!=null){
                    ans.next = new ListNode();
                    ans = ans.next;
                }
                l1 = l1.next;
            }
            while(l2!=null){
                ans.val = l2.val; 
                if(l2.next!=null){
                    ans.next = new ListNode();
                    ans = ans.next;
                }
                l2 = l2.next; 
            }

        }
        return head;
    }
}