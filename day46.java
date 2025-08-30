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
        ListNode slow=head; 
        ListNode fast=head; 
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow; 
        ListNode prev=null;
        ListNode next; 
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode left=head;
        ListNode right=prev;
         
         int currsum=0;
         int maxsum=0;

         while(right!=null){
            currsum=left.val+right.val;
            maxsum=Math.max(currsum, maxsum);
            left=left.next;
            right=right.next;

         }
         return maxsum;
    }
}