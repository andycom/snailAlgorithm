package com.fancv.stringLight;

/**
 * @author hamish-wu
 */
public class longestCommonPrefix {

    public static void main(String[] args) {

       /* String s[] = {""};
        String s2[] = {"ab", "a", "a", "a"};
        String s3[] = {"a", "ab"};

        System.out.println(longestCommonPrefix2(s));
        System.out.println(longestCommonPrefix2(s2));
        System.out.println(longestCommonPrefix2(s3));*/

        String a = "abavfddddssddmmmdddd";
    }

    /**
     * 使用高效方法
     * 最长子串
     *
     * @param strs
     * @return
     */
    public static String longestCommonPrefix2(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean tag = true;
        int i = 0;
        while (tag) {
            char tchar = 0;
            for (String s : strs) {
                char c = 0;
                char[] c1 = s.toCharArray();
                if (c1.length > i) {
                    c = c1[i];
                }
                if (c != 0) {
                    if (tchar == 0) {
                        tchar = c;
                    } else {
                        if (tchar != c) {
                            tag = false;
                            tchar = 0;
                            break;
                        }
                    }

                } else {
                    tchar = 0;
                    tag = false;
                    break;
                }
            }
            i = i + 1;
            if (tchar != 0) {
                stringBuilder.append(tchar);
            }
        }
        return stringBuilder.toString();
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean tag = true;
        int i = 0;
        while (tag) {
            char tchar = 0;
            for (String s : strs) {
                char c = 0;
                char[] c1 = s.toCharArray();
                if (c1.length > i) {
                    c = c1[i];
                }
                if (c != 0) {
                    if (tchar == 0) {
                        tchar = c;
                    } else {
                        if (tchar != c) {
                            tag = false;
                            tchar = 0;
                            break;
                        }
                    }

                } else {
                    tchar = 0;
                    tag = false;
                    break;
                }
            }
            i = i + 1;
            if (tchar != 0) {
                stringBuilder.append(tchar);
            }
        }
        return new String(stringBuilder);
    }

   /* public static String longestPalindrome(String s) {

        char[] tchar = s.toCharArray();
        int len = tchar.length;
        if (len == 0) {
            return "";
        } else if (len == 1) {
            return s;
        }
        if (len == 2 && tchar[0] == tchar[1]) {
            return s;
        }
        int len = 0;
        int start = 0;

        for (int i = 1; i < len; i++) {
            int total,t;
            if (tchar[i] == tchar[i + 1]) {
                total=2;
                t=
                for (int j = i; j > 0; j--) {
                    if (tchar[j] ==)
                }
            } else {
                for (int j = i; j > 0; j--) {

                }
            }
            for (int j = i; j > 0; j--) {

            }


        }


    }*/
}
