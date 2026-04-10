package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        int num = 5;
        double num2 = 1.20;

        System.out.println(isEven(num));
        System.out.println(isPositive(num2));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        return number > 0;
    }
}
