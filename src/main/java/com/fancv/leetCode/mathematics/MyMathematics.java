package com.fancv.leetCode.mathematics;


import java.util.Arrays;

public class MyMathematics {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
    }

    public static int[] findErrorNums(int[] nums) {
        int r[] = {0, 0};
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int len = (i + 1) < nums.length - 1 ? i + 1 : nums.length - 1;
            if (nums[i] == nums[len]) {
                r[0] = nums[i];
            }
            if (nums.length==2) {
                r[1] =
            }
        }

        return r;
    }

}
