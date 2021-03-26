package com.fancv.leetCode.LinkedList;

public class deleteDuplicatesOne {

    public static void main(String[] args) {
        ListNode a = new ListNode(4, null);
        ListNode b = new ListNode(2, a);
        ListNode c = new ListNode(2, b);
        ListNode d = new ListNode(2, c);
        ListNode e = new ListNode(1, d);

        ListNode result = deleteDuplicates(e);
        System.out.println(result.val);
    }


    /**
     * 删除链表中重复元素  回调
     * 1 1 2 3 3
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
            while (sail != null && head.val == sail.val) {
                sail = sail.next;
            }
        }
        head.next = deleteDuplicates(sail);

        return head;
    }

}
