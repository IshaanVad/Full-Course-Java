package Misc;

import java.util.Scanner;

public class methodPractice {

    private static Integer x;
    private static String a;
    private static String b;
    private static Double d;
    static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        iceCream();
    }

    static void iceCream() {

        System.out.println("Pick one: Ice Cream or Popsicle");
        a = userInput.nextLine();

        if (a.equals("Ice Cream") || a.equals("ice cream")) {
            System.out.println("Why do you enjoy this? ");
            b = userInput.nextLine();
            System.out.println("Cool!");
        } else if (a.equals("Popsicle") || a.equals("popsicle")) {
            System.out.println("Cool!");
        }
    }
}
