package com.javacourse.se.MyCalculator;

import java.util.Arrays;
import java.lang.String;
public class RomanToArabic extends Calculate {


    int RomeNum1ToArabic(String a) {
        String[] RomeNum1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int num1;
        num1 = Arrays.asList(RomeNum1).indexOf(a);
        if (num1 == -1)
            {
                throw new NumberFormatException("numbers must be in the range of (1 to 10)!!! ");
            }
        return num1;

    }
    int RomeNum2ToArabic(String b) {
        String[] RomeNum1 = {"0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        int num2;
        num2 =Arrays.asList(RomeNum1).indexOf(b);
        if (num2 == -1) {
                throw new NumberFormatException("numbers must be in the range of (1 to 10)!!! ");
        }
        return num2;

    }
}

