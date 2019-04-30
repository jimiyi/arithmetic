package com.yiwei.arithmetic.s002;

public class addTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode pre = head;
        int k = 0;
        ListNode p = l1;
        ListNode q = l2;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = x + y + k;
            //进位
            k = sum / 10;
            pre.next = new ListNode(sum % 10);
            if (p != null) p = p.next;
            if (q != null) q = q.next;
            pre = pre.next;
        }

        // 如果最后两个数字相加大于1，还需要多进一位至新的节点
        if(k > 0){
            pre.next = new ListNode(k);
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode a0 = new ListNode(5);
        ListNode a1 = new ListNode(4);
        a1.next = a0;
        ListNode a2 = new ListNode(3);
        a2.next = a1;

        ListNode b0 = new ListNode(5);
        ListNode b1 = new ListNode(6);
        b1.next = b0;
        ListNode b2 = new ListNode(4);
        b2.next = b1;

        ListNode res = addTwoNumbers(a2, b2);
        for (ListNode i = res; i != null; i = i.next) {
            System.out.print(i.val + " ");
        }
    }
}
