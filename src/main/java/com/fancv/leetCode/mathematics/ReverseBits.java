package com.fancv.leetCode.mathematics;

/**
 * @author hamish-wu
 */
public class ReverseBits {
    public static void main(String[] args) {

        int a = 0b11111111111111111111111111111101;
        System.out.println(Integer.toBinaryString(reverseBits(a)));
    }

    public static int reverseBits(int n) {
        String s = Integer.toUnsignedString(n, 2);
        int len = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        while (len < 32) {
            stringBuilder.append("0");
            len++;
        }
        stringBuilder.append(s).reverse();
        int s1 = Integer.parseUnsignedInt(stringBuilder.toString(),2);
        return s1;
    }
}
