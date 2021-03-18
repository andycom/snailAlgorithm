package com.fancv.leetCode;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 20. 有效的括号
 *
 * @author hamish-wu
 */
public class BracketsIsValid {
    public static void main(String[] args) {
        List<String> test = new LinkedList<String>();

        test.add("(([{(){]]]][");
        test.add("{{}{[[()]}{}}]");
        test.add("{}");
        test.add("{}[]");
        test.add("{{}[{}]{}}");
        test.add("{{}[{[{]]}]{}}");
        test.add("{{}({}[{]])[{}]{}}");


        for (String s : test) {
            System.out.println(isValid(s));
        }


    }

    /**
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            Character a = s.charAt(i);
            if (stack.isEmpty()) {
                stack.add(a);
            } else {
                Character b = stack.peek();
                if (a(b, a)) {
                    stack.pop();
                } else {
                    stack.add(s.charAt(i));
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }


    }

    /**
     * 判断括号是否成对
     *
     * @param a
     * @param b
     * @return
     */
    public static boolean a(char a, char b) {
        Boolean s = false;
        switch (a) {
            case '{':
                if (b == '}') {
                    s = true;
                }
                break;
            case '[':
                if (b == ']') {
                    s = true;
                }
                break;
            case '(':
                if (b == ')') {
                    s = true;
                }
                break;
        }
        return s;
    }

}
