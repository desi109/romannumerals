package com.mdesislava.romannumerals;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class ConverterSimple extends Converter {


    String convertNumberToRomanNumeral(String inputValue) throws IOException {
        StringBuilder sbRomanNumerals = new StringBuilder();
        String filePath = "C:\\Users\\c5300387\\Desktop\\romannumerals\\src\\main\\resources\\mapNumbers";
        Map<String, String> map = new HashMap<>();

        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(":", 2);
            String key = parts[0];
            String value = parts[1];
            map.put(key, value);
        }

        for (String key : map.keySet()) {
            if (key.equals(inputValue)) {
                inputValue = map.get(key);
            }
            reader.close();
        }

        sbRomanNumerals.append(inputValue);
        return sbRomanNumerals.toString();
    }

}
