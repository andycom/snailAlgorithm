package com.fancv.stringLight;

import java.util.Arrays;

public class LastWordLength_58 {

    public static void main(String[] args) {
        LastWordLength_58 lastWordLength_58 = new LastWordLength_58();

        System.out.println(lastWordLength_58.lengthOfLastWord("dhfjd sdflka moon"));
        System.out.println(lastWordLength_58.CheckPermutation("moongf ff", "mnff ofgo"));

    }

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int r = 0;
        for (int j = chars.length; j > 0; j--) {
            if (r == 0 && chars[j - 1] == 32) {
                continue;
            }
            if (chars[j - 1] != 32) {
                r++;
            } else {
                break;
            }
        }
        return r;
    }

    public boolean CheckPermutation(String s1, String s2) {

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();
        if (char1.length != char2.length) {
            return Boolean.FALSE;
        }
        Arrays.sort(char1);
        Arrays.sort(char2);
        for (int i = 0; i < char1.length; i++) {

            if (char1[i] == char2[i]) {
                continue;
            } else {
                return Boolean.FALSE;
            }
        }

        return Boolean.TRUE;
    }
}
