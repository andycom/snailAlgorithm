package com.fancv.dataStructure;

/**
 * 自己实现链表测试
 *
 * @author hamish-wu
 */
public class LinkedListTest {
    public static void main(String[] args) {

      /*  LinkedList lls = new LinkedList();

        System.out.println(lls.getHead());

        lls.insertData("this first data");

        System.out.println(lls.getHead());

        for (int i = 1; i < 100; i++) {
            lls.insertData(Integer.valueOf(i).toString());
        }

        Object del = lls.getHead();

        lls.deleteData(del);

        System.out.println(lls.getHead());*/


        /**
         * 链表翻转
         */

        Node a = new Node("A", 1, null);
        Node b = new Node("B", 2, a);
        Node c = new Node("C", 3, b);
        Node d = new Node("D", 4, c);


       /* Node sail = new Node("sail", 0, null);
        sail.setNext(d);
        while (sail.hasNext()) {
            System.out.print(sail.getNext().getData());
            sail = sail.getNext();
        }
        System.out.println("");*/
        System.out.println("接下来开始翻转链表");
/**
 * 借用三节点翻转链表
 */
        Node fake = new Node("fake", 0, null);
        Node sail = new Node("sail", 0, d);
        while (sail.hasNext()) {
            Node temp = sail.getNext();
            sail.setNext(sail.getNext().getNext());
            if (fake.hasNext()) {
                temp.setNext(fake.getNext());
                fake.setNext(temp);
            } else {
                fake.setNext(temp);
                temp.setNext(null);
            }
        }

        while (fake.hasNext()) {
            System.out.println(fake.getNext().getData());
            fake = fake.getNext();
        }
    }
}
