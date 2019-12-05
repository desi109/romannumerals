package com.mdesislava.romannumerals;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    private static Converter converterForAll = new ConverterForAll();
    //private static Converter converterSimple = new ConverterSimple();

    public static void main(String[] args) throws InputNotNumberException, IOException, NumberNotInRangeException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number between 1 and 20: ");
        String stringToConvertInNumber = scanner.next();

        converterForAll.checkIfTheNumberIsValidOddAndConvertItToRomanNumeral(stringToConvertInNumber);
        //converterSimple.checkIfTheNumberIsValidOddAndConvertItToRomanNumeral(stringToConvertInNumber);

    }
}