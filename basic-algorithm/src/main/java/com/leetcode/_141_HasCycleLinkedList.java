package com.leetcode;

import java.util.List;

/**
 * 给定一个链表，判断链表中是否有环
 *
 * 快慢指针
 * */
public class _141_HasCycleLinkedList {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}



