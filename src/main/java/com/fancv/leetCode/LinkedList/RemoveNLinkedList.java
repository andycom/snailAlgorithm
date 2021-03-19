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

        removeNthFromEnd(e, 2);
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
        int s = 1;
        sail.next = head;
        while (sail.next != null) {
            ListNode t = new ListNode();
            t = sail;
            sail = sail.next;
            if (s == size + 1 - n) {
                t.next = sail.next.next;
                break;
            }
            s++;

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
