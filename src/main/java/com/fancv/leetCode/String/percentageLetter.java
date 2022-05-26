package com.fancv.leetCode.String;

import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class percentageLetter {

    public static int percentageLetter(String s, char letter) {

        Long l =  s.chars().count();
        Long q = s.chars().filter(c-> c==letter).count();

        return (int)(100*(float)q/l);


    }

    public static void main(String[] args) {

        Boolean s = wordPattern("abba","dog dog dog dog");
        System.out.println(s);
    }

    public static boolean wordPattern(String pattern, String s) {

        int[] p = pattern.chars().toArray();
        String[] ss = s.split(" ");

        if(p.length!=ss.length){
            return false;
        }

        HashMap<Integer,String> map = new HashMap<>();
        HashMap<String,Integer> map2 = new HashMap<>();

        for(int i=0;i<p.length;i++){
            String temp = map.get(p[i]);
            Integer num = map2.get(ss[i]);
            if (null==num){
                map2.put(ss[i],p[i]);
            }else {
                if(num.equals(p[i])){
                    continue;
                }else {
                    return false;
                }
            }

            if(null==temp){
                map.put(p[i],ss[i]);
            }else{
                if(temp.equals(ss[i])){
                    continue;
                }else {
                    return false;
                }
            }
        }
        return true;
    }
}
