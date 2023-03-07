package com.fancv.sort;

import java.util.Arrays;

public class newBubbleSort {

    public static void main(String[] args) {
        System.out.println("盲写冒泡排序");

        int[] list = {11, 3, 5, 4, 3, 2, 5, 67, 34, 23, 33};
        sort(list);

        System.out.println(Arrays.stream(list).toArray());

    }

    static void sort(int[] list) {

        for (int i = 0; i < list.length - 1; i++) {
            for (int j = 0; j < list.length - 1 - i; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }

        }

    }
}
