package Misc;

import java.util.*;

public class printFSpecifiers {
    public static void main(String[] args) {

        boolean a = true; //%b
        char character = 'b'; //%c
        String x = "yes"; //%s
        int integer = 50; //%d
        double decimal = 100.21; //%d

        System.out.printf("%b\n", a);
        System.out.printf("%c\n", character);
        System.out.printf("%s\n", x);
        System.out.printf("%d\n", integer);
        System.out.printf("%f\n", decimal);
    }
}
