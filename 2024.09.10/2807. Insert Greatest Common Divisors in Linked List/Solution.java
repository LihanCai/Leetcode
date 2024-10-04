/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode ans = new ListNode(0, head);
        ListNode dummy = new ListNode(0, head);
        while (head.next != null) {
            dummy = dummy.next;
            head = head.next;
            ListNode insert = find(dummy.val, head.val);
            insert.next = head;
            dummy.next = insert;
            dummy = dummy.next;
        }
        return ans.next;
    }

    private ListNode find(int num1, int num2) {
        if (num1 < num2) {
            find(num2, num1);
        }
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return new ListNode(num1);
    }
}