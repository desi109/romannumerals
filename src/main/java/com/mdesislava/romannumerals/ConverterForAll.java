package com.mdesislava.romannumerals;

import java.util.*;

class ConverterForAll extends Converter {

    final Map<Integer, String> mapValues = new LinkedHashMap<Integer, String>() {{
        put(1000, "M");
        put(900, "CM");
        put(500, "D");
        put(400, "CD");
        put(100, "C");
        put(90, "XC");
        put(50, "L");
        put(40, "XL");
        put(10, "X");
        put(9, "IX");
        put(5, "V");
        put(4, "IV");
        put(1, "I");
    }};

    String convertNumberToRomanNumeral(String stringToConvertInNumber) {
        StringBuilder sbRomanNumerals = new StringBuilder();

        int startNumber = Integer.parseInt(stringToConvertInNumber);
        Set<Integer> keys = mapValues.keySet();

        while (startNumber != 0) {
            CHECK_VALUE:
            for (Integer key : keys) {
                if (startNumber >= key) {
                    sbRomanNumerals.append(mapValues.get(key));
                    startNumber -= key;
                    break CHECK_VALUE;
                }
            }
        }
        return sbRomanNumerals.toString();
    }


}
