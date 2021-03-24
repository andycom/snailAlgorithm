package com.fancv.stringLight;

public class modifyString {
    public static void main(String[] args) {

        System.out.println(modifyString("a?b?g?????df???sd?fif?W????sgs??"));
    }

    public static String modifyString(String s) {

        char temp[] = s.toCharArray();
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == '?') {
                char t = 'z';
                char left = i > 0 ? temp[i - 1] : '0';
                char right = i + 1 < temp.length ? temp[i + 1] : '0';
                while (t == left || t == right) {
                    t--;
                }
                temp[i] = t;
            }
        }
        return new String(temp);

    }


}
