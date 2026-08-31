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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null) return new int[]{-1,-1};
        ListNode first = head;
        if(first==null) return new int[]{-1,-1};
        ListNode second = first.next;
        if(second==null) return new int[]{-1,-1};
        ListNode third = second.next;
        int i = 0;
        boolean flag = false;
        int j = 0;
        int firstCritical = -1;
        int lastCritical = -1;
        int idx = 0;
        int gap = 0;
        int minGap = Integer.MAX_VALUE;
        while(third!=null){
            if((first.val>second.val && third.val>second.val) || (first.val<second.val && third.val<second.val)) {
                if(firstCritical==-1) firstCritical = idx+1;
                lastCritical = idx+1;
                if(flag){
                    minGap = Math.min(gap,minGap);
                    gap = 0; 
                }
                flag = true;
            }
            else{
                if(flag) gap++;
            }
            idx++;
            first = first.next;
            second = first.next;
            third = second.next;
        }
        if(firstCritical==lastCritical) return new int[]{-1,-1};
        else return new int[]{minGap+1,lastCritical-firstCritical};
    }
}