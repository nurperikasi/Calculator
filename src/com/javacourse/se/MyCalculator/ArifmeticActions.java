package com.javacourse.se.MyCalculator;

public class ArifmeticActions {
    int result;

    public int ActionPlus(int num1, int num2) {
        result = num1 + num2;
        return result;
    }

    public int ActionMinus(int num1, int num2) {
        result = num1 - num2;
        return result;
    }

    public int ActionMultiplication(int num1, int num2) {
        result = num1 * num2;
        return result;
    }

    public int ActionDevide(int num1, int num2) {
       result = num1 / num2;
        return result;
    }
}