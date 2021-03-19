package com.fancv.dataStructure;

/**
 * 自己实现链表测试
 *
 * @author hamish-wu
 */
public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList lls = new LinkedList();

        System.out.println(lls.getHead());

        lls.insertData("this first data");

        System.out.println(lls.getHead());

        for (int i = 1; i < 100; i++) {
            lls.insertData(Integer.valueOf(i).toString());
        }

        Object del=lls.getHead();

        lls.deleteData(del);

        System.out.println(lls.getHead());





    }
}
