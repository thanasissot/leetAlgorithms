package NeetCode150;

import NeetCode150.ListNode;

public class Leetcode_2 {
    /**
     * You are given two non-empty linked lists representing two non-negative integers.
     * The digits are stored in reverse order, and each of their nodes contains a single digit.
     * Add the two numbers and return the sum as a linked list.
     * -
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     */

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode listNodeTemp = head;

        int carry = 0;
        while (l1 != null && l2 != null) {
            int temp = l1.val + l2.val + carry;
            if (temp > 9) {
                temp %= 10;
                carry = 1;
            } else {
                carry = 0;
            }

            listNodeTemp.next = new ListNode(temp);
            listNodeTemp = listNodeTemp.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        while (l1 != null) {
            int temp = l1.val + carry;
            if (temp > 9) {
                temp %= 10;
                carry = 1;
            } else {
                carry = 0;
            }

            listNodeTemp.next = new ListNode(temp);
            listNodeTemp = listNodeTemp.next;

            l1 = l1.next;
        }

        while (l2 != null) {
            int temp = l2.val + carry;
            if (temp > 9) {
                temp %= 10;
                carry = 1;
            } else {
                carry = 0;
            }

            listNodeTemp.next = new ListNode(temp);
            listNodeTemp = listNodeTemp.next;

            l2 = l2.next;
        }

        if (carry > 0) {
            listNodeTemp.next = new ListNode(1);
        }

        return head.next;
    }

}
