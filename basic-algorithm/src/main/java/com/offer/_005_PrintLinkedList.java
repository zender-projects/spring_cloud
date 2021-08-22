package com.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 * 思路：
 *   1. 栈
 *   2. 递归
 *   3. 翻转后打印
 * @author：zhangdong@tianyancha.com
 * @date：2021-08-19 12:17
 * @version：1.0.0
 */
public class _005_PrintLinkedList {

    public int[] reversePrint(ListNode head) {

        //栈
        /*Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] result = new int[stack.size()];
        int idx = 0;
        while(!stack.isEmpty()){
            int val = stack.pop();
            result[idx ++] = val;
        }
        return result;*/

        //递归
        List<Integer> arrayList = reverse(head);
        int[] result = new int[arrayList.size()];
        int idx = 0;
        for (Integer integer : arrayList) {
            result[idx ++] = integer;
        }
        return result;
    }

    public List<Integer> reverse(ListNode head){
        List<Integer> list = new ArrayList<>();
        if(head != null) {
            list.addAll(reverse(head.next));
            list.add(head.val);
        }
        return list;
    }

}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}
