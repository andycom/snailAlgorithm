package com.fancv.leetCode;

import java.util.stream.IntStream;

public class hammingWeight {


    public static void main(String[] args) {
        int a = 0b00000000100000011010000010000000;
        System.out.println(hammingWeight(a));
        System.out.println(hammingWeight3(a));
    }

    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        char[] chars = s.toCharArray();

        int sum = 0;
        for (char a : chars) {
            if (a == '1') {
                sum++;
            }
        }
        return sum;
    }

    public static int hammingWeight2(int n) {
        String s = Integer.toBinaryString(n);
        IntStream intStream = s.chars();
        return s.chars().sum() - 48 * s.length();
    }

    public static int hammingWeight3(int n) {
        int res = 0;
        int a = 32;
        while (a != 0) {
            res += n & 1;
            n = n >> 1;
            a--;
        }
        return res;
    }
}
