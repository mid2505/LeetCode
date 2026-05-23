// Problem: Palindrome Linked List
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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return true;
        List l = new ArrayList<>();
        while(true){
            l.add(head.val);
            if(head.next!=null) head = head.next;
            else break;
        }
        for(int i=0;i<l.size()/2;i++){
            if(l.get(i)!=l.get(l.size()-i-1)) return false;
        }
        return true;
    }
}