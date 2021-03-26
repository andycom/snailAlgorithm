package com.fancv.leetCode.mathematics;


import java.util.Arrays;

public class MyMathematics {

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(400));
        System.out.println(nthUglyNumber(800));
        System.out.println(nthUglyNumber(1200));
        System.out.println(nthUglyNumber(1600));
        System.out.println(nthUglyNumber(200));
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
        if (n == 0) {
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

    /**
     * 丑数，数字 2 3 5 乘积
     *
     * @param n
     * @return
     */
    public boolean isUgly2(int n) {
        boolean r = false;
        //1.偶数
        while (n % 2 == 0) {
            n = n / 2;
        }
        //2.奇数 3的倍数
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }
        if (n == 1) {
            r = true;
        }
        return r;
    }

    /**
     * 第N 个丑数 笨办法
     *
     * @param n
     * @return
     */
    public static int nthUglyNumber(int n) {
        int i = 1;
        int temp = 0;
        if (n > 200) {
            i = 16200;
            temp = 199;
        } else if (n > 400) {
            i = 311040;
            temp = 399;
        } else if (n > 800) {
            i = 12754584;
            temp = 799;
        } else if (n > 1200) {
            i = 174960000;
            temp = 799;
        } else if (n > 1600) {
            i = 1399680000;
            temp = 1599;
        }
        for (; i < Integer.MAX_VALUE; i++) {
            if (isUgly(i)) {
                temp++;
            }
            if (temp == n) {
                return i;
            }
        }
        return 0;
    }

    /**
     * 第N 个丑数  三指针算法
     *
     * @param n
     * @return
     */
    public static int nthUglyNumber2(int n) {






        return 0;
    }
}
