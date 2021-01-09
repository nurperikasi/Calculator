package com.javacourse.se.MyCalculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;

public class ConsolePrint {
    void input() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter first number, math sign (+,-,*,/) and second number: ");
        String str = reader.readLine();
        int num1, num2;
        int d1;
        int d2;
        int resultArabic;
        RomanToArabic romeToArabic = new RomanToArabic();
        ArifmeticActions arifmeticActions = new ArifmeticActions();
        ArabicToRoman arabicToRoman = new ArabicToRoman();
        for (int j=0; j<1; j++) {
            if (str.contains("+")) {
                String delimeter = "\\+";
                String[] s1 = str.split(delimeter);
                String a = s1[0];
                String b = s1[1];
                try {
                    d1 = Integer.parseInt(a);
                    d2 = Integer.parseInt(b);
                } catch (NumberFormatException | NullPointerException nfe) {
                    num1 = romeToArabic.RomeNum1ToArabic(a);
                    num2 = romeToArabic.RomeNum2ToArabic(b);
                    resultArabic = arifmeticActions.ActionPlus(num1, num2);
                    System.out.println("result is: " + arabicToRoman.Print(resultArabic));
                    break;
                }
                num1 = Integer.parseInt(a);
                num2 = Integer.parseInt(b);
                if ((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10)) {
                    System.out.println("result is: " + arifmeticActions.ActionPlus(num1, num2));

                }
                System.out.println("numbers must be only arabic or only roman in the range of (1 to 10)!!! ");
                break;
            }


            if (str.contains("-")) {
                String[] s1 = str.split("-");
                    String a = s1[0];
                    String b = s1[1];

                    try {
                        d1 = Integer.parseInt(a);
                        d2 = Integer.parseInt(b);
                    } catch (NumberFormatException | NullPointerException nfe) {
                        num1 = romeToArabic.RomeNum1ToArabic(a);
                        num2 = romeToArabic.RomeNum2ToArabic(b);
                        resultArabic = arifmeticActions.ActionMinus(num1, num2);
                        System.out.println("result is: " + arabicToRoman.Print(resultArabic));
                        break;
                    }
                    num1 = Integer.parseInt(a);
                    num2 = Integer.parseInt(b);
                    if ((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10)) {
                        System.out.println("result is: " + arifmeticActions.ActionMinus(num1, num2));
                    }
                    System.out.println("numbers must be only arabic or only roman in the range of (1 to 10)!!! ");
                    break;

            }
            if (str.contains("*")) {
                String[] s1 = str.split("\\*");
                    String a = s1[0];
                    String b = s1[1];

                    try {
                        d1 = Integer.parseInt(a);
                        d2 = Integer.parseInt(b);
                    } catch (NumberFormatException | NullPointerException nfe) {
                        num1 = romeToArabic.RomeNum1ToArabic(a);
                        num2 = romeToArabic.RomeNum2ToArabic(b);
                        resultArabic = arifmeticActions.ActionMultiplication(num1, num2);
                        System.out.println("result is: " + arabicToRoman.Print(resultArabic));
                        break;
                    }
                    num1 = Integer.parseInt(a);
                    num2 = Integer.parseInt(b);
                    if ((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10)) {
                        System.out.println("result is: " + arifmeticActions.ActionMultiplication(num1, num2));
                    } else
                        System.out.println("numbers must be only arabic or only roman in the range of (1 to 10)!!! ");
                    break;

            }
                else if (str.contains("/")) {
                String[] s1 = str.split("/");
                    String a = s1[0];
                    String b = s1[1];

                    try {
                        d1 = Integer.parseInt(a);
                        d2 = Integer.parseInt(b);
                    } catch (NumberFormatException | NullPointerException nfe) {
                        num1 = romeToArabic.RomeNum1ToArabic(a);
                        num2 = romeToArabic.RomeNum2ToArabic(b);
                        resultArabic = arifmeticActions.ActionDevide(num1, num2);
                        System.out.println("result is: " + arabicToRoman.Print(resultArabic));
                        break;
                    }
                    num1 = Integer.parseInt(a);
                    num2 = Integer.parseInt(b);
                    if ((num1 > 0 && num1 <= 10) && (num2 > 0 && num2 <= 10)) {
                        System.out.println("result is: " + arifmeticActions.ActionDevide(num1, num2));
                    }
                    else
                        System.out.println("numbers must be only arabic or only roman in the range of (1 to 10)!!! ");
                break;
            }
            throw new NumberFormatException("math sign must be '+', '-', '*' or '/'!!! ");

        }
    }


}

