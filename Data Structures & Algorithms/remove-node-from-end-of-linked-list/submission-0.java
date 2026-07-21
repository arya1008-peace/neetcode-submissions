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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int totalCount = 0;
        ListNode temp = head;
        while(temp != null){
            totalCount++;
            temp = temp.next;
        }
        int remove = totalCount - n;
        if(remove == 0){
            return head.next;
        }
        ListNode current = head;
        for(int i = 1; i < totalCount; i++){
            if(i == remove){
                current.next = current.next.next;
                break;
            }
            current = current.next;
        }
        return head;
    }
}
