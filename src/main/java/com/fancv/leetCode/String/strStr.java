package com.fancv.leetCode.String;

import java.util.Stack;

public class strStr {


    public static int strStr(String haystack, String needle) {
            if(haystack.contains(needle)){
               return haystack.indexOf(needle);
            }else {
                return -1;
            }

    }

    public static void main(String[] args) {
     /*   System.out.println( strStr("hello","ll"));
        System.out.println( strStr("",""));*/

        System.out.println(calculate("1*5+12-3+9*1+856/80"));

    }

    /**
     * 字符串计算机
     * @param s
     * @return
     */
    public  static int calculate(String s) {

        s = s.replace(" ", "");
        int l = s.length();
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char flag = '+';
        for (int i = 0; i < l; i++) {
            if (Character.isDigit(chars[i])) {
                num = num * 10 + (chars[i]-'0');
            }
            if (!Character.isDigit(chars[i])  || i == s.length()-1) {
                switch (flag) {
                    case '+':
                        stack.add(num);
                        break;
                    case '-':
                        stack.add(-num);
                        break;
                    case '*':
                        stack.add(stack.pop() * num);
                        break;
                    case '/':
                        stack.add(stack.pop() / num);
                        break;
                }
                flag = s.charAt(i);
                num = 0;

            }


            }
        num = 0;
        while (!stack.empty()) {
            num = num + stack.pop();
        }

        return num;
    }



}
