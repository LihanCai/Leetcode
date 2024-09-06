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
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        ListNode temp = new ListNode();
        ListNode ans = temp;
        // System.out.println(head.val);
        while(head != null){
            if(set.contains(head.val)){
                temp.next = head;
            }
            else{
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;

        }
        temp.next = null;
        return ans.next;
    }
}