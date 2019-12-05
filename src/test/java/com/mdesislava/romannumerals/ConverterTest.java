package com.mdesislava.romannumerals;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class ConverterTest {

    Converter converter = new Converter() {
        @Override
        String convertNumberToRomanNumeral(String stringToConvertInNumber) throws IOException {
            return null;
        }
    };


    @Test(expected = InputNotNumberException.class)
    public void isTheInputNumber() throws InputNotNumberException {
        boolean result = converter.isTheInputNumber("4");
        assertThat(result, is(equalTo(true)));
        result = converter.isTheInputNumber("0");
        assertThat(result, is(equalTo(true)));
        result = converter.isTheInputNumber("-1");
        assertThat(result, is(equalTo(true)));
        result = converter.isTheInputNumber("ab");
        assertThat(result, is(equalTo(false)));
        result = converter.isTheInputNumber("-");
        assertThat(result, is(equalTo(false)));
    }

    @Test(expected = NumberNotInRangeException.class)
    public void isTheNumberValid() throws NumberNotInRangeException, InputNotNumberException {
        boolean result = converter.isTheNumberValid("4");
        assertThat(result, is(equalTo(true)));
        result = converter.isTheNumberValid("1");
        assertThat(result, is(equalTo(true)));
        result = converter.isTheNumberValid("0");
        assertThat(result, is(equalTo(false)));
        result = converter.isTheNumberValid("-1");
        assertThat(result, is(equalTo(false)));
        result = converter.isTheNumberValid("21");
        assertThat(result, is(equalTo(false)));
    }

    @Test
    public void isNumberOdd() throws IOException, NumberNotInRangeException, InputNotNumberException {
        boolean result = converter.isTheNumberOdd("1");
        assertThat(result, is(true));
        result = converter.isTheNumberOdd("2");
        assertThat(result, is(false));
    }

}
