package com.mdesislava.romannumerals;

import org.junit.Test;

import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class ConverterForAllTest extends ConverterTest {

    Converter converterForAll = new ConverterForAll();

    @Test
    public void convertNumberToRomanNumeral() throws IOException {
        assertThat("I", is(equalTo(converterForAll.convertNumberToRomanNumeral("1"))));
        assertThat("V", is(equalTo(converterForAll.convertNumberToRomanNumeral("5"))));
        assertThat("IX", is(equalTo(converterForAll.convertNumberToRomanNumeral("9"))));
        assertThat("XI", is(equalTo(converterForAll.convertNumberToRomanNumeral("11"))));
        assertThat("XVII", is(equalTo(converterForAll.convertNumberToRomanNumeral("17"))));
        assertThat("XIX", is(equalTo(converterForAll.convertNumberToRomanNumeral("19"))));
    }

}
