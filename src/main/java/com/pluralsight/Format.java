package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String firstName = "Bob";
        String secondName = "Smith";
        String formattedNaame = formatName(firstName,secondName);
        System.out.println(formattedNaame);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}
