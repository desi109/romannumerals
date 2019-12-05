package com.mdesislava.romannumerals;

import java.io.IOException;

abstract class Converter {


    public Converter() {
    }

    boolean isTheInputNumber(String stringToConvertInNumber) throws InputNotNumberException {
        try {
            Integer.parseInt(stringToConvertInNumber);
            return true;
        } catch (NumberFormatException nfe) {
            throw new InputNotNumberException("Wrong input! You must enter a number!");
        }
    }


    boolean isTheNumberValid(String stringToConvertInNumber) throws NumberNotInRangeException, InputNotNumberException {
        try {
            int numberToConvert = Integer.parseInt(stringToConvertInNumber);
            if (numberToConvert > 0 && numberToConvert < 21) {
                return true;
            } else {
                throw new NumberNotInRangeException("Wrong input! You must enter a number between 1 and 20!");
            }
        } catch (NumberFormatException nfe) {
            throw new InputNotNumberException("Wrong input! You must enter a number!");
        }
    }


    boolean isTheNumberOdd(String stringToConvertInNumber) throws IOException, NumberNotInRangeException, InputNotNumberException {
        try {
            int numberToConvert = Integer.parseInt(stringToConvertInNumber);

            if (isTheNumberValid(stringToConvertInNumber)) {
                if (numberToConvert % 2 != 0) {
                    System.out.println(numberToConvert + " as a roman numeral: " + convertNumberToRomanNumeral(Integer.toString(numberToConvert)));
                    return true;
                } else {
                    System.out.println(numberToConvert + " as a number: " + numberToConvert);
                    return false;
                }

            } else {
                throw new InputNotNumberException("Wrong input! You must enter a number!");
            }
        } catch (NumberFormatException nfe) {
            throw new InputNotNumberException("Wrong input! You must enter a number!");
        }
    }


    abstract String convertNumberToRomanNumeral(String stringToConvertInNumber) throws IOException;

    public void checkIfTheNumberIsValidOddAndConvertItToRomanNumeral(String stringToConvertInNumber) throws
            InputNotNumberException, IOException, NumberNotInRangeException {
        if (isTheInputNumber(stringToConvertInNumber) && isTheNumberValid(stringToConvertInNumber)) {
            isTheNumberOdd(stringToConvertInNumber);
        }
    }
}
