package com.fancv.leetCode.arrays;

import java.util.HashMap;
import java.util.Map;

public class MyArrays {
    public static void main(String[] args) {
        int[] rains = {1, 2, 0, 0, 2, 4};
        avoidFlood(rains);
    }

    public static int[] avoidFlood(int[] rains) {
        int ans[] = new int[rains.length];

        int zero = 0;
        Map<Integer, Integer> r = new HashMap<>();
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] > 0) {
                if (r.get(rains[i]) == null) {
                    r.put(rains[i], i);
                } else {
                    int reained = r.get(rains[i]);
                    for (int j = 0; j < i; j++) {
                        if (ans[j] == 0) {
                            ans[j] = reained;
                            r.put(rains[i], i);
                        }
                    }
                }
                ans[i] = -1;
            } else {
                zero++;
                ans[i] = 0;
            }
        }


        return ans;
    }
}
