package com.fancv.leetCode.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 17 https://leetcode-cn.com/problems/letter-combinations-of-a-phone-number/
 */
public class letterCombinations {
    public static List<String> letterCombinations(String digits) {
        List<String> r = new ArrayList<>();
        if (null == digits || digits.isEmpty()) {
            return r;
        }

        Map<Character, String> h = new HashMap<>(16);
        h.put('2', "abc");
        h.put('3', "def");
        h.put('4', "ghi");
        h.put('5', "jkl");
        h.put('6', "mno");
        h.put('7', "pqrs");
        h.put('8', "puv");
        h.put('9', "wxyz");

        if (digits.length() == 1) {
            String t = h.get(digits.charAt(0));
            for (char c : t.toCharArray()) {
                r.add(Character.toString(c));
            }
            return r;
        }
        if (digits.length() == 2) {
            for (char a1 : h.get(digits.charAt(0)).toCharArray()) {
                for (char a2 : h.get(digits.charAt(1)).toCharArray()) {
                    r.add(Character.toString(a1) + a2);
                }
            }

            return r;
        }
        if (digits.length() == 3) {
            for (char a1 : h.get(digits.charAt(0)).toCharArray()) {
                for (char a2 : h.get(digits.charAt(1)).toCharArray()) {
                    for (char a3 : h.get(digits.charAt(2)).toCharArray()) {
                        r.add(Character.toString(a1) + a2+a3);
                    }
                }
            }

            return r;
        }
        if (digits.length() == 4) {
            for (char a1 : h.get(digits.charAt(0)).toCharArray()) {
                for (char a2 : h.get(digits.charAt(1)).toCharArray()) {
                    for (char a3 : h.get(digits.charAt(2)).toCharArray()) {
                        for (char a4 : h.get(digits.charAt(3)).toCharArray()) {
                            r.add(Character.toString(a1) + a2+a3+a4);
                        }
                    }
                }
            }

            return r;
        }
        return r;


    }

    public static void main(String[] args) {
        String d = "23";

        System.out.println(letterCombinations(d));
    }

}
