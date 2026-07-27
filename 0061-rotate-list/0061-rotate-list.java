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
        if(head==null || head.next == null || k==0){
            return head;
        }
        ListNode tail = head;
        int length = 1;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        k = k%length;
        if(k==0){
            return head;
        }

        tail.next = head;

        int lengthOftail = length - k;

        ListNode newTail = head;


        for(int i = 0; i<lengthOftail - 1; i++){
            newTail = newTail.next;
        }

        ListNode newNode = newTail.next;
         newTail.next = null;

        return newNode;
    }
}