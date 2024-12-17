package org.uni.linkedList;

import org.uni.utils.LinkedList;
import org.uni.utils.LinkedList.ListNode;

import java.util.PriorityQueue;

public class SolutionSeventh {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists) {
            if (node != null) {
                minHeap.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {
            ListNode minNode = minHeap.poll();

            current.next = minNode;
            current = current.next;

            if (minNode.next != null) {
                minHeap.offer(minNode.next);
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode[] lists1 = new ListNode[3];
        lists1[0] = new ListNode(1);
        lists1[0].next = new ListNode(4);
        lists1[0].next.next = new ListNode(5);

        lists1[1] = new ListNode(1);
        lists1[1].next = new ListNode(3);
        lists1[1].next.next = new ListNode(4);

        lists1[2] = new ListNode(2);
        lists1[2].next = new ListNode(6);

        ListNode result1 = mergeKLists(lists1);
        LinkedList.printList(result1);

        ListNode[] lists2 = new ListNode[0];
        ListNode result2 = mergeKLists(lists2);
        LinkedList.printList(result2);

        ListNode[] lists3 = new ListNode[1];
        lists3[0] = null;
        ListNode result3 = mergeKLists(lists3);
        LinkedList.printList(result3);
    }
}
