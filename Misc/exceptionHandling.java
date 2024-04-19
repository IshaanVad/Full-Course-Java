package Misc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionHandling {
    public static void main(String[] args) {

        //exception = an event that occurs during the execution of a program that
        //            disrupts the normal flow of instructions

        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter a whole number to divide: ");
            double x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            double y = scanner.nextInt();

            double z = x / y;

            System.out.println("result: " + z);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
