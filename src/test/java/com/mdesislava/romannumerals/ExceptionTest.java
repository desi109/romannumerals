package com.mdesislava.romannumerals;

import org.junit.*;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.anyString;

public class ExceptionTest {


    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Mock
    Converter converter = new Converter() {
        @Override
        String convertNumberToRomanNumeral(String stringToConvertInNumber) throws IOException {
            return null;
        }
    };


    @Spy
    Converter converter1 = Mockito.spy(converter);


    @Test
    public void isTheNumberValidIfIsNotANumber() throws NumberNotInRangeException, InputNotNumberException {
        Mockito.doReturn(false).when(converter1).isTheInputNumber(anyString());

        thrown.expect(InputNotNumberException.class);
        converter1.isTheNumberValid("a");

        thrown.expect(NumberNotInRangeException.class);
        converter1.isTheNumberValid("-1");
    }

    @Test
    public void isTheNumberValidIfIsANumber() throws NumberNotInRangeException, InputNotNumberException {
        Mockito.doReturn(true).when(converter1).isTheInputNumber(anyString());

        thrown.expect(InputNotNumberException.class);
        converter1.isTheNumberValid("a");

        thrown.expect(NumberNotInRangeException.class);
        converter1.isTheNumberValid("-1");
    }
}


