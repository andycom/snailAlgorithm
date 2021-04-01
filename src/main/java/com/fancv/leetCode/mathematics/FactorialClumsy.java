package com.fancv.leetCode.mathematics;

/**
 * @author hamish-wu
 */
public class FactorialClumsy {


    public static void main(String[] args) {

        System.out.println(clumsy(4));
    }

    /**
     * 通常，正整数 n 的阶乘是所有小于或等于 n 的正整数的乘积。例如，factorial(10) = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1。
     * <p>
     * 相反，我们设计了一个笨阶乘 clumsy：在整数的递减序列中，我们以一个固定顺序的操作符序列来依次替换原有的乘法操作符：乘法(*)，除法(/)，加法(+)和减法(-)。
     * <p>
     * 例如，clumsy(10) = 10 * 9 / 8 + 7 - 6 * 5 / 4 + 3 - 2 * 1。然而，这些运算仍然使用通常的算术运算顺序：我们在任何加、减步骤之前执行所有的乘法和除法步骤，并且按从左到右处理乘法和除法步骤。
     * <p>
     * 另外，我们使用的除法是地板除法（floor division），所以 10 * 9 / 8 等于 11。这保证结果是一个整数。
     * <p>
     * 实现上面定义的笨函数：给定一个整数 N，它返回 N 的笨阶乘。
     * <p>
     *  
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/clumsy-factorial
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     *
     * @param N
     * @return
     */
    public static int clumsy(int N) {
        int result = 0;
        boolean b = false;
        for (int m = N; m > 0; m = m - 4) {
            result = result + threeNum(m, b);
            b =  true;
        }


        return result;
    }

    /**
     * 四个数字一组计算
     *
     * @param a
     * @param b
     * @return
     */
    public static int threeNum(int a, boolean b) {
        int temp = 0;
        if (a > 3) {
            temp = a * (a - 1) / (a - 2);
            if (b) {
                return (a - 3) - temp;
            } else {
                return temp + a - 3;
            }
        } else {
            if (a == 1 || a == 2) {
                temp = a;
            } else {
                temp = 6;
            }
        }
        if (b) {
            temp = -temp;
        }
        return temp;
    }
}
