package com.fancv.stringLight;

/**
 * @author hamish-wu
 */
public class longestCommonPrefix {

    public static void main(String[] args) {

        String s[] = {"as", "a"};
        String s2[] = {"ab","a","a","a"};
        String s3[] = {"a","ab"};

        System.out.println(longestCommonPrefix(s));
        System.out.println(longestCommonPrefix(s2));
        System.out.println(longestCommonPrefix(s3));
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
                            tchar=0;
                            break;
                        }
                    }

                } else {
                    tchar=0;
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
}
