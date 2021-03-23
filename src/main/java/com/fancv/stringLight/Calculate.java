package com.fancv.stringLight;

public class Calculate {
    public static void main(String[] args) {

        System.out.println(calculate("1+1*2/4+5*5/5/5-3-2-5*5+2"));
    }

    public static int calculate(String s) {

        String p[] = s.split("\\+");

        int r = 0;
        for (String a : p) {
            if (a.contains("-")) {
                String l[] = a.split("-");
                for (String l1 : l) {
                    if (l1.contains("*") || l1.contains("/")) {
                        char[] as = l1.toCharArray();


                    }
                }
            }

        }

        return 0;
    }
}
