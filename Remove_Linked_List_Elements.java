// Problem: Remove Linked List Elements
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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return head;
        ListNode prev = new ListNode();
        prev.next = head;
        ListNode cur = head;
        ListNode begin = head;
        while(cur!=null){
                if(cur.val==val){
                    if(begin==cur){
                        begin = cur.next;
                        prev.next = begin;
                    }
                    else{
                        prev.next = cur.next;
                    }
                    cur = cur.next;
                }
                else{
                    prev = prev.next;
                    cur = cur.next;
                }
        }
        return begin;
    }
}


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


 
 /*

class Solution {
    int carry = 0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode finall = ans;
        while(l1!=null){
            ListNode temp = l1.next;
            temp.next = l1;
            l1 = temp;
        }
        while(l2!=null){
            ListNode temp = l2.next;
            temp.next = l2;
            l2 = temp;
        }
        while(l1!=null && l2!=null){
            ListNode lt = new ListNode();
            int temp = l1.val + l2.val;
            if(temp+carry<9){
                carry = 0;
                lt.val = temp+carry;
            }
            else{
                int t = temp+carry%10;
                lt.val = t;
                carry = 1;
            }
            ans = lt;
            ans = ans.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1!=null){
            ListNode lt = new ListNode();
            int temp = l1.val;
            if(temp+carry<9){
                carry = 0;
                lt.val = temp+carry;
            }
            else{
                int t = temp+carry%10;
                lt.val = t;
                carry = 1;
            }
            ans = lt;
            ans = ans.next;
            l1 = l1.next;
        }
        while(l1!=null){
            ListNode lt = new ListNode();
            int temp = l2.val;
            if(temp+carry<9){
                carry = 0;
                lt.val = temp+carry;
            }
            else{
                int t = temp+carry%10;
                lt.val = t;
                carry = 1;
            }
            ans = lt;
            ans = ans.next;
            l2 = l2.next;
        }
        while(ans!=null){
            ListNode temp = ans.next;
            temp.next = ans;
            ans = temp;
        }
        return finall;
    }
}
*/