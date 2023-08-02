package NeetCode150;

import crackingthecodinginterview.node.Node;

public class LeetCode_234 {
    /**
     * Given the head of a singly linked list, return true if it is a
     * palindrome or false otherwise.
     * Follow up: Could you do it in O(n) time and O(1) space?
     */
    public static boolean isPalindrome(ListNode head) {
        // size 0 or 1
        if (head == null || head.next == null) {
            return true;
        }
        // size 2
        if (head.next.next == null) {
            return head.val == head.next.val;
        }
        // size 3
        if (head.next.next.next == null) {
            return head.val == head.next.next.val;
        }

        ListNode slow = head;
        ListNode next = head.next;
        ListNode fast = head.next.next;
        ListNode prev = null;

        while (fast != null && fast.next != null && next != null) {
            // fast is two nodes forward
            fast = fast.next.next;
            // previous is slow
            prev = slow;
            // slow is next
            slow = next;
            // next is one node forward
            next = next.next;
            // slow points backwards
            slow.next = prev;
        }
        // when loop breaks fast is null, next is the middle
        // second part and slow is the middle first part
        // unless the array is odd sized
        if (fast != null && next != null) {
            next = next.next;
        }

        while(slow != null && next != null) {
            if (slow.val != next.val) {
                return false;
            }
            slow = slow.next;
            next = next.next;
        }

        return true;
    }

}
