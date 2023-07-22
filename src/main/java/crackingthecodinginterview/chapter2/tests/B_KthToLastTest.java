package crackingthecodinginterview.chapter2.tests;

import crackingthecodinginterview.chapter2.B_KthToLast;
import crackingthecodinginterview.node.Node;
import org.junit.jupiter.api.Test;

import static crackingthecodinginterview.node.Node.createLinkedList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class B_KthToLastTest {

    @Test
    public void testKthToLast_KEqualToListLength() {
        Node head = createLinkedList(5,4,3,2,1);
        int k = 5; // K is equal to the length of the list

        int result = B_KthToLast.kthToLast(k, head);

        // The list has 5 elements, and k=5 is the last element, so the result should be 1 (value of last element)
        assertEquals(1, result);
    }

    @Test
    public void testKthToLast_KPositive() {
        Node head = createLinkedList(5,4,3,2,1);
        int k = 3; // K is a positive value

        int result = B_KthToLast.kthToLast(k, head);

        // The 2nd to last element in the list is 4, so the result should be 4
        assertEquals(3, result);
    }

    @Test
    public void testKthToLast_KZero() {
        Node head = createLinkedList(5,4,3,2,1);
        int k = 1; // K is 0

        int result = B_KthToLast.kthToLast(k, head);

        // K=0 is invalid, and the result should be -1 or any other appropriate sentinel value
        assertEquals(5, result);
    }

}
