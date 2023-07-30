package NeetCode150;

public class LeetCode_86 {

      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    /**
     * Given the head of a linked list and a value x,
     * partition it such that all nodes less than x come before nodes greater than or equal to x.
     * -
     * You should preserve the original relative order of the nodes in each of the two partitions.
     */
    public static ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode list1 = new ListNode();
        ListNode head1 = list1;
        ListNode list2 = new ListNode();
        ListNode head2 = list2;

        ListNode temp = head;
        while (temp != null) {
            ListNode insert = new ListNode(temp.val);
            if (temp.val < x) {
                list1.next = insert;
                list1 = list1.next;
            } else {
                list2.next = insert;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (head1 == list1) {
            if (head2 == list2) {
                return head;
            }
            head2 = head2.next;
            return head2;
        } else {
            head1 = head1.next;
            if (head2 == list2) {
                return head1;
            }
            head2 = head2.next;
            list1.next = head2;
            return head1;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        a.next = b;

        ListNode c = partition(a, 0);
        System.out.println(c);
    }

}
