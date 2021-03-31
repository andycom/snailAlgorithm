package com.fancv.leetCode.arrays;

import java.util.*;

public class MyArrays {
    public static void main(String[] args) {
        int[] rains = {1, 1, 1, 2, 2, 3, 1, 4, 6, 7};
        int[] b = {-1, 1, 2, 2};
        int[] c = {1, 2, 1, 1, 2, 2, 3, 3, 3};
        System.out.println(subsetsWithDup(b));
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

    /**
     * 1.计算数组所有不重复的子集
     * 输入：nums = [1,1,1,1,2]
     * 输出：[[],[1],[1,1],[1,1,1],[1,1,1,1],[1,1,1,1,2]]
     * 输入：nums = [1,1,2,2]
     * 输出：[[],[1],[1,1],[1,1,2],[1,1,2,2],[1,2][1,2,2][2,2][2]]
     * <p>
     * 反思，
     * 1.计算子集的算法不对，遗漏很多子集
     * 2.去重算法不对
     * <p>
     * nums=[-1,1,1,2]
     * 子集 [-1] [-1,1],[-1,1,1][-1,1,1,2][-1,1][-1,1,2][1][1,1][1,1,2][1,2][2]
     *
     * @param nums
     * @return
     */
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        /**
         * 1.外层循环 2的len 次方
         * C 0/4  + C 1/4 +C2/4+C3/4 +C4/4
         * 1 + 4+ 6+ 4+1=16
         *
         */
        for (int i = 0; i < (1 << len); ++i) {
            list.clear();
            /**
             * 2.内层循环j<len
             *
             */
            boolean tag = true;
            for (int j = 0; j < len; ++j) {
                if ((i & (1 << j)) != 0) {
                    if (j > 0 && (1 << (j - 1) & i) == 0 && nums[j] == nums[j - 1]) {
                        tag = false;
                        break;
                    }
                    list.add(nums[j]);
                }
            }
            if (tag) {
                result.add(new ArrayList<>(list));
            }

        }
        return result;

    }

}
