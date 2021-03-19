package com.fancv.leetCode.LinkedList;

/**
 * 19. 删除链表的倒数第 N 个结点
 *
 * @author hamish-wu
 */
public class RemoveNLinkedList {

    public static void main(String[] args) {
        ListNode a = new ListNode(1, null);
        ListNode b = new ListNode(2, a);
        ListNode c = new ListNode(3, b);
        ListNode d = new ListNode(4, c);
        ListNode e = new ListNode(5, d);

        removeNthFromEnd(e, 5);
        System.out.println("结束");
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

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
