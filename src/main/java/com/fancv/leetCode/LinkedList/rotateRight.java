package com.fancv.leetCode.LinkedList;

public class rotateRight {

    public static void main(String[] args) {
    /*    ListNode a = new ListNode(5, null);
        ListNode b = new ListNode(4, a);*/
        ListNode c = new ListNode(3, null);
        ListNode d = new ListNode(2, c);
        ListNode e = new ListNode(1, d);
        rotateRight(e, 200000000);
        System.out.println();
    }

    /**
     *
     *
     * @param head
     * @param k
     * @return
     */
    public static ListNode rotateRight(ListNode head, int k) {


        if (head == null || k == 0) {
            return head;
        }
        ListNode sail = head;
        int len = 1;
        while (sail.next != null) {
            len++;
            sail = sail.next;
        }

        ListNode tail = null;
        //循环节点
        tail = sail;
        sail.next = head;
        sail = head;
        //得到循环的次数
        int loop = len - (k % len);

        for (int i = 0; i < loop; i++) {
            sail = sail.next;
            tail = tail.next;
        }
        tail.next = null;

        return sail;
    }
}
