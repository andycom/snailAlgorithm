package com.fancv.sort;

import java.util.Arrays;

public class maximumProduct {


    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int[] nums2 = {2, 2, 2, 3, 3, 4, 4};
        int[] nums3 = {0, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 2, 2, 2};
        int[] nums4 = {1,2,3};

        System.out.println(majorityElement(nums));
        System.out.println(majorityElement(nums2));
        System.out.println(majorityElement(nums3));
        System.out.println(majorityElement(nums4));

    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int a = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        if (nums[nums.length - 1] <= 0 || nums[0] >= 0) {
            return a;
        } else if (nums[nums.length - 1] > 0 && nums[0] < 0) {
            return a > b ? a : b;
        } else {
            return 0;
        }

    }

    public static int majorityElement(int[] nums) {
        int len = nums.length;
        int r = -1;
        if (len == 1) {
            return nums[0];
        }
        Arrays.sort(nums);

        if (len % 2 == 1) {
            len = len - 1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < len/2+1 && nums[i] - nums[i + (len / 2)] == 0) {
                r = nums[i];
                break;
            }

        }

        return r;
    }
}
