package com.fancv.stringLight;

public class beautySum {

    public static void main(String[] args) {
        String s = "aabcbaa";
        System.out.println(beautySum(s));
    }

    /**
     * 1.计算出字符的所有可能子串
     * 2.计算子串的美丽数
     * 3.所有的美丽数求和
     *
     * @param s
     * @return
     */
    public static int beautySum(String s) {
        int sum = 0;
        int len = s.length();

        for (int i = 0; i < len - 2; i++) {
            for (int j = i+3; j <= len; j++) {
                String temp = s.substring(i, j);
                sum = sum +beauty(temp);
            }
        }
        return sum;
    }

    /**
     * 计算美丽数
     *
     * 使用 int[26] 表示字符串出现次数
     *
     * @param s
     * @return
     */
    public static int beauty(String s) {
        System.out.println(s);
        int[] counts = new int[26];
        char[] marcher = s.toCharArray();
        for (char a : marcher) {
            counts[a - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int count : counts) {
            if (count > 0) {
                max = Math.max(max, count);
                min = Math.min(min, count);
            }
        }
        return max-min;

    }
}
