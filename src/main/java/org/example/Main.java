package org.example;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println(stringCutter("I'm string for stringcutter method", 10));
        System.out.println(stringTrimmer("I'm string for stringcutter method", 10));

    }

    public static int sum(int a, int b){
        return a + b;
    }
    public static int min(int a, int b){
        return a - b;
    }
    public static int mult(int a, int b){
        return a * b;
    }
    public static int div(int a, int b){
        return a / b;
    }

    public static String stringCutter(String string, int length) {
        Splitter splitter = Splitter.fixedLength(length);
        return splitter.split(string).toString();
    }

    // Trim method by guava
    public static String stringTrimmer(String input, int maxLength) {
        if (input == null || input.length() <= maxLength) {
            return input;
        }
        //return Strings.padEnd(input.substring(0, maxLength), maxLength, '.');
        // Subtract 3 from maxLength to make space for "..."
        return Strings.padEnd(input.substring(0, maxLength), maxLength, ' ') + "...";
    }

}

