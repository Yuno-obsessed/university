package org.uni.linkedList;

import org.uni.utils.LinkedList;
import org.uni.utils.LinkedList.ListNode;

public class SolutionSixth {

    public static ListNode doubleNumber(ListNode head) {
        if (head == null) {
            return null;
        }

        int carry = doubleHelper(head);

        if (carry > 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            return newHead;
        }
        return head;
    }

    private static int doubleHelper(ListNode node) {
        if (node == null) {
            return 0;
        }

        int carry = doubleHelper(node.next);

        int sum = node.val * 2 + carry;

        node.val = sum % 10;

        return sum / 10;
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(8);
        head1.next.next = new ListNode(9);
        ListNode result1 = doubleNumber(head1);
        LinkedList.printList(result1);

        ListNode head2 = new ListNode(9);
        head2.next = new ListNode(9);
        head2.next.next = new ListNode(9);
        ListNode result2 = doubleNumber(head2);
        LinkedList.printList(result2);
    }
}
