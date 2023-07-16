package NeetCode150_old.Easy;

import NeetCode150_old.InnerClasses.ListNode;

public class _234 {
    public boolean isPalindrome(ListNode head) {
        // get linked list length
        ListNode temp = head;
        int len = 0;
        while (head != null) {
            head = head.next;
            len++;
        }
        // reverse the 2nd half of the linked list
        // take into account even and odd length
        if (len % 2 == 1) {
            len += 1;
        }
        len /= 2;
        head = temp;
        //
        for (int i = 0; i < len; i++) temp = temp.next;
        ListNode prev = null;
        ListNode current = temp;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        temp = prev;

        // check palindrome
        while (head != null && temp != null && head != temp) {
            if (head.val != temp.val) return false;
            head = head.next;
            temp = temp.next;
        }

        return true;
    }
}
