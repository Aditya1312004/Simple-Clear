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
    public ListNode rotateRight(ListNode head, int k) {

        if(head == null || head.next == null) return head;
        ListNode s = head;
        int length = 1;
        
        
        while(s.next!=null){
            length++;
            s = s.next;
        }
        s.next = head;

        int rotate = length - (k%length);
        while(rotate-- > 0){
            s = s.next;

        }
        ListNode newHead = s.next;
        s.next = null;

        return newHead;
    }
}