package com.fancv.leetCode.String;

public class strStr {


    public static int strStr(String haystack, String needle) {
            if(haystack.contains(needle)){
               return haystack.indexOf(needle);
            }else {
                return -1;
            }

    }

    public static void main(String[] args) {
        System.out.println( strStr("hello","ll"));
        System.out.println( strStr("",""));
    }
}
