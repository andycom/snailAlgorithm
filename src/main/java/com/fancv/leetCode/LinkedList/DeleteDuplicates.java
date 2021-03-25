package com.fancv.leetCode.LinkedList;

/**
 * @author hamish-wu
 */
public class DeleteDuplicates {

    public static void main(String[] args) {

        ListNode a = new ListNode(4, null);
        ListNode b = new ListNode(3, a);
        ListNode c = new ListNode(2, b);
        ListNode d = new ListNode(1, c);
        ListNode e = new ListNode(1, d);

        ListNode result = deleteDuplicates(e);

       /* ListNode a1 = new ListNode(4, null);
        ListNode b1 = new ListNode(3, a1);
        ListNode c1 = new ListNode(2, b1);*/
        ListNode d1 = new ListNode(1, null);
        ListNode e1 = new ListNode(1, d1);
        ListNode resultq = deleteDuplicates(e1);
        System.out.println();

    }

    /**
     * 递归思想
     * 1. 1 1 1 2 3 4
     * 2. 1
     * 3. 1 2 3 3 4 4
     *
     * @param head
     * @return
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode sail = head.next;
        if (head.val == sail.val) {
            while (sail!= null && head.val == sail.val) {
                sail = sail.next;
            }
            head = deleteDuplicates(sail);
        } else {
            head.next = deleteDuplicates(sail);
        }

        return head;

    }
}
