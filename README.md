# RomanNumeralConverter
Converting arabic numbers (between 1 and 20) to roman numerals if they are odd.
###### Input -> must be number between 1 and 20

## Examples
###### Valid
```
Converter converterForAll = new ConverterForAll("1");
Input -> 1 as a roman numeral: I

Converter converterForAll = new ConverterForAll("10");
Input -> 10 as a number: X

Converter converterForAll = new ConverterForAll("19");
Input -> 19 as a roman numeral: XIX

Converter converterForAll = new ConverterForAll("20");
Input -> 20 as a number: 20
```
  
  
###### Invalid(exceptions are thrown)
```
Converter converterForAll = new ConverterForAll("a");
InputNotNumberException is thrown -> Wrong input! You must enter a number!

Converter converterForAll = new ConverterForAll("0");
NumberNotInRangeException is thrown -> Wrong input! You must enter a number between 1 and 20!
```
