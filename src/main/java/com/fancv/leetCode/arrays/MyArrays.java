package com.fancv.leetCode.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class MyArrays {
    public static void main(String[] args) {
        int[] rains = {1, 0, 2, 0, 3, 0, 2, 0, 0, 0, 1, 2, 3};
        System.out.println(Arrays.toString(avoidFlood(rains)));
    }

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
}
