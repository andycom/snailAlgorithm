package com.fancv.leetCode.mathematics;


import java.util.Arrays;

public class MyMathematics {

    public static void main(String[] args) {
        System.out.println(isUgly(0));
        System.out.println(isUgly(2));
        System.out.println(isUgly(1024));
        System.out.println(isUgly(14));
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
     *
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

    /**
     * 丑数，数字 2 3 5 乘积
     *
     * @param n
     * @return
     */
    public static boolean isUgly(int n) {
        boolean r = false;
        if(n==0){
            return r;
        }
        //1.偶数
        if (n % 2 == 0) {
            n = n / 2;
            if (n == 1) {
                r = true;
            } else {
                return isUgly(n);
            }
        }
        //2.奇数 3的倍数
        else if (n % 3 == 0) {
            n = n / 3;
            if (n == 1) {
                r = true;
            } else {
                return isUgly(n);
            }

        } else if (n % 5 == 0) {
            n = n / 5;
            if (n == 1) {
                r = true;
            } else {
                return isUgly(n);
            }

        }
        if (n == 1) {
            r = true;
        }
        return r;

    }
}
