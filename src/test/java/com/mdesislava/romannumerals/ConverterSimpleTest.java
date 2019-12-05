package com.mdesislava.romannumerals;

import java.io.IOException;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ConverterSimpleTest extends ConverterTest {
    Converter converterSimple = new ConverterSimple();

    @Test
    public void convertNumberToRomanNumeral() throws IOException {
        assertThat("I", is(equalTo(converterSimple.convertNumberToRomanNumeral("1"))));
        assertThat("V", is(equalTo(converterSimple.convertNumberToRomanNumeral("5"))));
        assertThat("IX", is(equalTo(converterSimple.convertNumberToRomanNumeral("9"))));
        assertThat("XI", is(equalTo(converterSimple.convertNumberToRomanNumeral("11"))));
        assertThat("XVII", is(equalTo(converterSimple.convertNumberToRomanNumeral("17"))));
        assertThat("XIX", is(equalTo(converterSimple.convertNumberToRomanNumeral("19"))));
    }

}

