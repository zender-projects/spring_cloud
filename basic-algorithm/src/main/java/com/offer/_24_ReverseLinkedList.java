package com.offer;

public class _24_ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode newRoot = null;  //新的根节点
        ListNode node = head;
        ListNode prev = null;
        while (head != null) {
            //临时存储下一个
            ListNode next = node.next;
            if (next == null) {
                newRoot = node;
            }
            node.next = prev;
            prev = node;
            node = next;
        }
        return newRoot;
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}



