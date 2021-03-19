package com.fancv.dataStructure;

/**
 * java 链表 单项链表
 *
 * @author hamish-wu
 */
public class LinkedList {

    /**
     * 头节点
     */
    private Node head;

    /**
     * 判断链表是否为空
     *
     * @return
     */

    private Boolean isEmpty() {
        if (null == head) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * 获取头节点
     *
     * @return
     */
    public Object getHead() {
        if (null == head) {
            return null;
        } else {
            return head.getData();
        }

    }

    /**
     * 获取头节点
     *
     * @return
     */
    public Node getHeadNode() {
        if (null == head) {
            return null;
        } else {
            return head;
        }

    }

    /**
     * 增加节点
     */
    public boolean insertData(Object data) {

        if (isEmpty()) {
            head = new Node("first", data, null);
        } else {
            Node temp = head;
            while (temp.hasNext()) {
                temp = temp.getNext();
            }
            temp.setNext(new Node("last", data, null));
        }
        return true;

    }

    /**
     * 删除节点
     */

    public boolean deleteData(Object data) {

        if (isEmpty()) {
            return false;
        } else {
            /**
             * 如果是头节点 直接删除返回
             */
            if (head.getData() == data) {
                head = head.getNext();
                return true;
            } else {
                while (head.hasNext()) {
                    Node temp = head.getNext();
                    if (temp.getData() == data) {
                        head.setNext(temp.getNext());
                        break;
                    }
                }
                return true;
            }
        }


    }
}

/**
 * 链表节点
 */
class Node {


    private String name;

    private Object data;

    private Node next;


    public Node(String name, Object data, Node next) {
        this.name = name;
        this.data = data;
        this.next = next;
    }

    public boolean hasNext() {
        if (null == next) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
