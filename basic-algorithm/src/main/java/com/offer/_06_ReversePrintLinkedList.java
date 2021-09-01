package com.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 从尾到头打印链表.
 * */
public class _06_ReversePrintLinkedList {

    //用栈实现
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        int idx = 0;
        while (!stack.isEmpty()) {
            result[idx ++] = stack.pop();
        }
        return result;
    }

    public int[] reversePrint2(ListNode head) {
        List<Integer> list = reverse(head);
        int[] result = new int[list.size()];
        int idx = 0;
        while (!list.isEmpty()) {
            result[idx] = list.get(idx);
            idx ++;
        }
        return result;
    }

    //用递归实现
    public List<Integer> reverse(ListNode listNode) {
        List<Integer> list = new ArrayList<>();
        if (listNode != null) {
            list.addAll(reverse(listNode.next));
            list.add(listNode.val);
        }
        return list;
    }

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

}


