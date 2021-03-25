package com.fancv.leetCode.mathematics;


import java.util.Arrays;

public class MyMathematics {

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1, 1}));
        System.out.println(threeConsecutiveOdds(new int[]{1, 2, 2}));
        System.out.println(threeConsecutiveOdds(new int[]{1, 3, 5, 4, 5}));
        System.out.println(threeConsecutiveOdds(new int[]{0, 2, 3, 2, 4, 5, 7, 9}));
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

    /**
     * 连续三个奇数
     * 实习生，进一步输出这个三个连续的奇数
     * @param arr
     * @return
     */
    public static boolean threeConsecutiveOdds(int[] arr) {

        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            if (temp % 2 == 1) {
                s++;
                if (s > 2) {
                    return true;
                }
            } else {
                s = 0;
            }


        }
        return false;
    }

}
