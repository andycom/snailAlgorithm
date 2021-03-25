package com.fancv.leetCode.mathematics;


import java.util.Arrays;

public class MyMathematics {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 1})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 3, 5, 4, 5})));
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 3, 2, 4, 5, 6, 7, 8, 9})));
    }

    public static int[] findErrorNums(int[] nums) {
        int r[] = {0, 0};
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int len = (i + 1) < nums.length - 1 ? i + 1 : nums.length - 1;
            if (r[0] == 0 && nums[i] == nums[len]) {
                r[0] = nums[i];
            }
            if (r[1] == 0 && nums[i] != i + 1 && nums[len] != i + 1) {
                r[1] = i + 1;
            }
        }
        return r;
    }

}
