package org.uni.utils;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public ListNode head;

    public LinkedList(ListNode head) {
        this.head = head;
    }

    public static class ListNode {
        public Integer val;
        public ListNode next;

        public ListNode(Integer val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public int[] toIntArray() {
            if (val == null) {
                return new int[0];
            }

            ListNode curr = this;

            List<Integer> ints = new ArrayList<>();
            while (curr != null) {
                ints.add(curr.val);
                curr = curr.next;
            }
            int[] array = new int[ints.size()];
            for (int i = 0; i < ints.size(); i++) {
                array[i] = ints.get(i);
            }
            return array;
        }
    }

    public static void printList(LinkedList list) {
        printList(list.head);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) {
                System.out.print(" -> ");
            }
            head = head.next;
        }
        System.out.println();
    }

}
