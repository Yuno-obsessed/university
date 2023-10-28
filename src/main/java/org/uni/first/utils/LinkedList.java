package org.uni.first.utils;

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

}
