package com.fancv.stringLight;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class lengthOfLongestSubstring {

    public static void main(String[] args) {
        String s = "wewewke";
        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        List<Character> chars = new ArrayList<Character>();
        chars.add(s.charAt(0));
        int m = 0;
        for (int i = 1; i < s.length(); i++) {
            if (chars.contains(s.charAt(i))) {
                if (m < chars.size()) {
                    m = chars.size();
                }
                chars = chars.subList(chars.indexOf(s.charAt(i)) + 1, chars.size());
                chars.add(s.charAt(i));
            } else {
                chars.add(s.charAt(i));
            }

        }

        return m < chars.size() ? m : chars.size();
    }

}
