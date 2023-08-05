package NeetCode150;

public class LeetCode_160 {
    // Given the heads of two singly linked-lists headA and headB, return the node at which
    // the two lists intersect. If the two linked lists have no intersection at all, return null.
    // The test cases are generated such that there are no cycles anywhere in the entire linked structure.
    // Note that the linked lists must retain their original structure after the function returns.
    // Note that the intersection is defined based on reference, not value. That is, if the kth
    // node of the first linked list is the exact same node (by reference) as the jth node of the second
    // linked list, then they are intersecting

    // HINTS
    // You can do this in O(A+B) time and 0(1) additional space. That is, you do not need a
    // hash table (although you could do it with one).
    // -
    // Focus first on just identifying if there's an intersection.
    // -
    // Observe that two intersecting linked lists will always have the same last node. Once they
    // intersect, all the nodes after that will be equal
    // -
    // You can determine if two linked lists intersect by traversing to the end of each and
    // comparing their tails.
    // -
    // Now, you need to find where the linked lists intersect. Suppose the linked lists were the
    // same length. How could you do this?
    // -
    // If the two linked lists were the same length, you could traverse forward in each until you
    // found an element in common. Now, how do you adjust this for lists of different lengths?
    // -
    // Try using the difference between the lengths of the two linked lists.
    // -
    // If you move a pointer in the longer linked list forward by the difference in lengths, you
    // can then apply a similar approach to the scenario when the linked lists are equal.

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 1;
        int lenB = 1;

        ListNode tempA = headA;
        while (tempA.next != null) {
            lenA++;
            tempA = tempA.next;
        }

        ListNode tempB = headB;
        while (tempB.next != null) {
            lenB++;
            tempB = tempB.next;
        }

        if (tempA != tempB) {
            // lists do not intersect
            return null;
        }

        lenA++;
        lenB++;
        int difference = 0;
        tempA = headA;
        tempB = headB;
        if (lenA > lenB) {
            difference = lenA - lenB;
        }
        else if (lenB > lenA) {
            tempA = headB;
            tempB = headA;
            difference = lenB - lenA;
        }

        while (difference > 0 && tempA != null) {
            tempA = tempA.next;
            difference--;
        }

        while (tempA != tempB && tempA != null && tempB != null) {
            tempA = tempA.next;
            tempB = tempB.next;
        }

        return tempA;
    }


}
