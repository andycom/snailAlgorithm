package com.fancv.leetCode.LinkedList;

/**
 * 19. 删除链表的倒数第 N 个结点
 *
 * @author hamish-wu
 */
public class RemoveNLinkedList {

    public static void main(String[] args) {
        ListNode a = new ListNode(12, null);
        ListNode b = new ListNode(5, null);
        ListNode c = new ListNode(4, null);
        ListNode d = new ListNode(3, c);
        ListNode e = new ListNode(1, d);

        /*removeNthFromEnd(e, 5);
        System.out.println("结束");*/

        mergeTwoLists( b,e);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode sail = new ListNode();
        sail.next = head;
        while (null != sail.next) {
            size++;
            sail = sail.next;

        }
        if (size == 1 & n == 1) {
            head = null;
            return head;
        }
        if (size == n) {
            head = head.next;
            return head;
        }
        int s = 0;
        ListNode sail2 = new ListNode();
        sail2.next = head;

        while (sail2.next != null) {
            ListNode t = new ListNode();
            t = sail2;
            sail2 = sail2.next;
            if (s == size - n) {
                t.next = sail2.next;
                break;
            }
            s = s + 1;

        }
        return head;
    }

    /**
     * 2. 两数相加 链表相加
     *
     * @param l1
     * @param l2
     * @return
     */
    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode s1 = new ListNode(0, l1);
        ListNode s2 = new ListNode(0, l2);

        int a = 0;
        while (s1.next != null) {
            s1.next = s1.next.next;
            a++;
        }
        int b = 0;
        while (s2.next != null) {
            s2.next = s2.next.next;
            b++;
        }
        ListNode result = new ListNode();
        if (a >= b) {
            s1 = new ListNode(0, l1);
            s2 = new ListNode(0, l2);
        } else {
            s1 = new ListNode(0, l2);
            s2 = new ListNode(0, l1);
        }

        result.next = s1.next;
        while (s1.next != null) {
            int sum = 0;
            if (s2.next != null) {
                sum = s1.next.val + s2.next.val;
                s2.next = s2.next.next;
            } else {
                sum = s1.next.val;
            }
            if (sum >= 10) {
                s1.next.val = sum - 10;
                if (s1.next.next != null) {
                    s1.next.next.val += 1;
                } else {
                    s1.next.next = new ListNode(1, null);
                }
            } else {
                s1.next.val = sum;
            }

            s1.next = s1.next.next;


        }
        return result.next;

    }

    /**
     * 合并两个有序链表
     *
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        //头节点
        ListNode head1 = null;
        //新节点尾部节点
        ListNode head2 = null;
        //遍历节点
        ListNode sail = null;
        /**
         * 链表有空的情况
         */
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l2 == null && l1 != null) {
            return l1;
        }
        if (l1 == null && l2 == null) {
            return l1;
        }
/**
 *选择l1遍历
 */

        boolean tail = false;
        if (l1.val >= l2.val) {
            head1 = l2;
            head2 = l1;
            sail = l1;
            tail = true;
        } else {
            head1 = l1;
            head2 = l2;
            sail = l2;
        }

        while (head1 != null && head2 != null) {
            if (head1.next != null && head1.next.val <= sail.val) {
                head1 = head1.next;
            } else {
                sail = head1.next;
                head1.next = head2;
                head1 = head1.next;
                head2 = sail;
            }
        }

        if (tail) {
            return l2;
        } else {
            return l1;
        }

    }


}


