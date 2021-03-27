package com.fancv.leetCode.mathematics;

import java.util.Arrays;

/**
 * @author hamish-wu
 */
public class MathArray {


    public static void main(String[] args) {


        int a[] = {1, 1, 1, 2, 3, 10, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 7, 8, 9, 10, 11, 12, 13, 14};
        int b[] = {2, 1, 2, 2, 3, 1, 0, 0, 9, 5, 5, 5, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 3};
        int c[] = {1, 3, 2, 2, 10, 4, 2, 3, 5, 9};
        int d[] = {1, 3, 3, 10, 4, 2, 3, 5};


        System.out.println(findLengthOfShortestSubarray(a));
        System.out.println(findLengthOfShortestSubarray(b));
        System.out.println(findLengthOfShortestSubarray(c));
        System.out.println(findLengthOfShortestSubarray(d));

    }

    public int maximumGap(int[] nums) {

        //1.排序
        Arrays.sort(nums);

        //2.遍历元素，计算相邻元素差值 最大


        return 0;
    }

    /**
     * [1,12,3,10,4,2,3,5]  非递减
     * <p>
     * 1.特殊情况
     * 2.循环遍历 i
     *
     * @param arr
     * @return
     */
    public static int findLengthOfShortestSubarray(int[] arr) {
        int r = 0;
        int len = arr.length;
        int tail = -1;
        //1.判断空 和length  为1 的情况
        if (arr == null || len == 1) {
            return r;
        }
        // 1.循环遍历
        int temp = -1;
        for (int i = 0; i < len; i++) {
            //2.相等后移
            if (temp < 0) {
                temp = arr[i];
            }
            if (arr[i] == temp) {
                continue;
            }
            int head = -1;
            int sum = 0;
            int min = -1;
            for (int j = i + 1; j < len; j++) {
                if (arr[j] < temp && arr[j] > min) {
                    if (head < 0) {
                        head = j;
                    }
                    sum++;
                }
            }
            if (head < sum) {
                r = r + head;
            } else {
                r = r + sum;

            }


        }

        return r;
    }

}
