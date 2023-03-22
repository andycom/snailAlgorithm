package com.fancv.leetCode.arrays;

public class GetIndex724 {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{2, 1 - 1}));
    }

    public static int pivotIndex(int[] nums) {
        int total = nums.length;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {

            if (left * 2 == total - nums[i] && i != nums.length - 1) {
                return i;
            }
            left = left + nums[i];

        }
        return -1;
    }
}
