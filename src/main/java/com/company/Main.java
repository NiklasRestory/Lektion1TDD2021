package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean isLeapYear(int year) {
        return isDivisibleBy(year, 4) &&
                (!isDivisibleBy(year, 100) ||
                        isDivisibleBy(year, 400));
    }

    public static boolean isDivisibleBy(int year, int number) {
        return year % number == 0;
    }
}
