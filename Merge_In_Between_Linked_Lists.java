// Problem: Merge In Between Linked Lists
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode ans = list1;
        int a1 = a;
        int i=0;
        while(i<a-1){
            list1=list1.next;
            i++;
        }
        ListNode list1_rem = list1;
        i = a-1;
        while(i<=b){
            list1_rem = list1_rem.next;
            i++;
        }
        list1.next = list2;
        ListNode tail = list2;
        while(tail.next!=null){
            tail = tail.next;
        }
        tail.next = list1_rem;
        
        return ans;
    }
}