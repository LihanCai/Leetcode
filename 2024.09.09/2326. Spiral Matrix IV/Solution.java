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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        for (int[] row : ans) {
            Arrays.fill(row, -1);
        }
        if (m == 1 && n == 1) {
            ans[0][0] = (head == null ? -1 : head.val);
            return ans;
        }
        int r = 0;
        int c = 0;
        int round = 1;
        while (head != null) {
            boolean flag = false;
            while (c < n - round && head != null) {
                ans[r][c] = head.val;
                head = head.next;
                c++;
                flag = true;
            }
            while (r < m - round && head != null) {
                ans[r][c] = head.val;
                head = head.next;
                r++;
                flag = true;
            }
            while (c >= round && head != null) {
                ans[r][c] = head.val;
                head = head.next;
                c--;
                flag = true;
            }
            while (r >= round && head != null) {
                ans[r][c] = head.val;
                head = head.next;
                r--;
                flag = true;
            }
            if (flag == false) {
                ans[r][c] = (head == null ? -1 : head.val);
                break;
            }
            round++;
            r++;
            c++;

        }

        return ans;
    }
}