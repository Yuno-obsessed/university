package org.uni.linkedList;

import org.uni.utils.LinkedList;
import org.uni.utils.LinkedList.ListNode;

import java.util.Objects;

public class SolutionSecond {

    public static LinkedList removeDuplicates(LinkedList list) {
        ListNode curr = list.head;
        while (curr != null) {
            ListNode next = curr.next;
            if (curr.next != null && Objects.equals(curr.val, next.val)) {
                curr.next = next.next;
            } else {
                curr = curr.next;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(4, new ListNode(4, new ListNode(5, new ListNode(5, new ListNode(6))))))));
        LinkedList list = new LinkedList(head);

        LinkedList.printList(list);
        LinkedList deduplicatedList = removeDuplicates(list);
        LinkedList.printList(deduplicatedList);

    }

}
