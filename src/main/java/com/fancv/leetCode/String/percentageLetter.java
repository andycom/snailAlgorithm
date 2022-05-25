package com.fancv.leetCode.String;

import java.text.DecimalFormat;

public class percentageLetter {

    public static int percentageLetter(String s, char letter) {

        Long l =  s.chars().count();
        Long q = s.chars().filter(c-> c==letter).count();

        return (int)(100*(float)q/l);


    }

    public static void main(String[] args) {
        int s=percentageLetter("sdfsooooaooewrddd",'o');
        System.out.println(s);
    }
}
