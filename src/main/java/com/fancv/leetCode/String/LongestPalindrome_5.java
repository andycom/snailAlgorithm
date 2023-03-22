package com.fancv.leetCode.String;

public class LongestPalindrome_5 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbfddfddddffgdsgsdfgsdffffdddffffgsdfgsdgsdgsdff"));
    }

    public static String longestPalindrome(String s) {

        int l = s.length();
        String sub1 = null;
        for (; l > 0; l--) {
            for (int j = 0; j + l <= s.length(); j++) {
                sub1 = s.substring(j, l + j);
                if (isPalindromic(sub1)) {
                    return sub1;
                }
            }
        }
        return null;
    }

    public static boolean isPalindromic(String s) {
        int len = s.length();
        for (int i = 0; i < len / 2; i++) {
            if (s.charAt(i) != s.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
