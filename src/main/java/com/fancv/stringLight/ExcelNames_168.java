package com.fancv.stringLight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExcelNames_168 {

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
    }


    public static String convertToTitle(int columnNumber) {

        Map<Integer, String> integerStringMap = new HashMap<>(26);
        integerStringMap.put(1, "A");
        integerStringMap.put(2, "B");
        integerStringMap.put(3, "C");
        integerStringMap.put(4, "D");
        integerStringMap.put(5, "E");
        integerStringMap.put(6, "F");
        integerStringMap.put(7, "G");
        integerStringMap.put(8, "H");
        integerStringMap.put(9, "I");
        integerStringMap.put(10, "J");
        integerStringMap.put(11, "K");
        integerStringMap.put(12, "L");
        integerStringMap.put(13, "M");
        integerStringMap.put(14, "N");
        integerStringMap.put(15, "O");
        integerStringMap.put(16, "P");
        integerStringMap.put(17, "Q");
        integerStringMap.put(18, "R");
        integerStringMap.put(19, "S");
        integerStringMap.put(20, "T");
        integerStringMap.put(21, "U");
        integerStringMap.put(22, "V");
        integerStringMap.put(23, "W");
        integerStringMap.put(24, "X");
        integerStringMap.put(25, "Y");
        integerStringMap.put(26, "Z");

        List<Integer> d = new ArrayList<>(24);
        operation(columnNumber, d);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = d.size(); i > 0; i--) {
            stringBuilder.append(integerStringMap.get(d.get(i - 1)));
        }

        return stringBuilder.toString();
    }

    public static void operation(int i, List<Integer> r) {
        if (i > 26) {
            int k = i % 26;
            if (k == 0) {
                r.add(26);
                i = i-26;
            } else {
                r.add(k);
            }
            i = i / 26;
            if (i > 26) {
                operation(i, r);
            } else {
                r.add(i);
            }

        }else {
            r.add(i);
        }


    }
}
