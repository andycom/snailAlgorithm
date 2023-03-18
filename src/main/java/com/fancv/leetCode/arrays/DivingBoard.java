package com.fancv.leetCode.arrays;

public class DivingBoard {

    public static void main(String[] args) {

        System.out.println(divingBoard(1, 1, 123));
    }

    public static int[] divingBoard(int shorter, int longer, int k) {


        if (k == 0) {
            return new int[k];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        int[] r = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {

            r[i] = shorter * (k - i) + longer * i;
        }
        return r;

    }
}
