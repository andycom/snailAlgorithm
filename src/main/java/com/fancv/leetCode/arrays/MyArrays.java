package com.fancv.leetCode.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MyArrays {
    public static void main(String[] args) {
        int[] rains = {2, 1, 3, 5, 4, 6, 7};
        int[] b = {3, 2, 1};
        int[] c = { 1, 25, 35, 68, 66, 90};
        System.out.println(getWinner(c, 3000));
    }

    /**
     * 避免洪水
     *
     * @param rains
     * @return
     */
    public static int[] avoidFlood(int[] rains) {
        int ans[] = new int[rains.length];
        Map<Integer, Integer> r = new HashMap<>();
        //存储可以 rains[i] == 0 的索引位置（这里使用 TreeSet 是为了方便查找 适合 排空湖泊 的索引天数）
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < rains.length; i++) {
            if (rains[i] > 0) {
                if (r.containsKey(rains[i])) {
                    //查出第几天哪个池塘下过雨
                    int reained = r.get(rains[i]);
                    Integer zeroIdx = set.higher(reained);
                    if (zeroIdx == null) {
                        int a[] = {};
                        return a;
                    }
                    ans[zeroIdx] = rains[i];
                    set.remove(zeroIdx);
                }
                r.put(rains[i], i);
                ans[i] = -1;
            } else {
                set.add(i);
            }
        }

        for (int i = 0; i < ans.length; i++) {
            if (ans[i] == 0) {
                ans[i] = 1;
            }
        }
        return ans;
    }

    /**
     * 获取获胜者
     * <p>
     * 1.假设 winner 从 index 0 开始
     * 2.比较之后 j>i+1 是否符合条件
     * 4.若比较过程中  j< arr.lenght-1 计算循环值，每次计算
     * 5.如果  循环一轮之后 无论k 多大 均返回 arr[i] 值
     *
     * @param arr
     * @param k
     * @return
     */
    public static int getWinner(int[] arr, int k) {
        int winner = 0;
        int tempk = 0;
        for (int i = 0; i < arr.length; i++) {
            winner = arr[i];
            for (int j = i + 1; j < 2 * arr.length; j++) {
                if (j >= arr.length) {
                    j = j - arr.length;
                }
                if (i == j) {
                    continue;
                }
                if (arr[j] < winner) {
                    tempk++;
                } else {
                    winner = arr[j];
                    tempk = 1;
                }
                if (tempk == k || tempk >= arr.length - 1) {
                    return winner;
                }

            }

        }
        return winner;

    }
}
