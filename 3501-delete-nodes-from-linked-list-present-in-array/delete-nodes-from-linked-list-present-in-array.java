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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode point = dummy;
        HashSet<Integer> as = new HashSet<>();

        ListNode curr = head;
        for(int num : nums){
            as.add(num);
        }
        while(curr !=null){
            if(as.contains(curr.val)){
                point.next = curr.next;
            }
            else{
                point = curr;
            }
            curr = curr.next;
        }
        return dummy.next;
    }
}