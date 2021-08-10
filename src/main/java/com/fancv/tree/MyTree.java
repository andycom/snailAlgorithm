package com.fancv.tree;

import java.util.LinkedList;

/**
 * 基本的树
 */
public class MyTree {


    /**
     * 最普通的树的构造器
     *
     * 分析若list 中没有null
     * 则会退化成一个链表，总是填充左侧节点
     * 所以需要平衡二叉树
     *
     *
     * @param list
     * @return
     */
    public static TreeNode createBinaryTree(LinkedList<Integer> list) {
        TreeNode node = null;
        if (list == null || list.isEmpty()) {
            return null;
        }
        Integer data = list.removeFirst();
        if (data != null) {
            node = new TreeNode(data);
            node.leftChild = createBinaryTree(list);
            node.rightChild = createBinaryTree(list);
        }
        return node;
    }

    /**
     * 前序遍历
     * @param node
     */
    public static void preOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }

    /**
     * 中序遍历
     * @param node
     */
    public static void inOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraveral(node.leftChild);
        System.out.print(node.data + " ");
        inOrderTraveral(node.rightChild);
    }

    /**
     * 后续遍历
     * @param node
     */
    public static void postOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraveral(node.leftChild);
        postOrderTraveral(node.rightChild);
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.add(11);
        list.add(12);


        TreeNode treeNode = createBinaryTree(list);


        System.out.println("前序遍历：");
        preOrderTraveral(treeNode);
        System.out.println("\n"+"中序遍历：");
        inOrderTraveral(treeNode);
        System.out.println("\n"+"后序遍历：");
        postOrderTraveral(treeNode);

    }


}


class TreeNode {
    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }
}