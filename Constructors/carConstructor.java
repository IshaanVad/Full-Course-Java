package Constructors;

import java.util.Scanner;

public class carConstructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What car are you looking for? ");
        String carName = sc.nextLine();
        System.out.print("What year are you looking for? ");
        Integer carYear = sc.nextInt();

        Car car1 = new Car(carName, carYear);

        System.out.println("You are looking for a " + car1.carName);
        System.out.println("The year of the car is " + car1.carYear);

    }

    public static class Car {

        final String carName;
        final Integer carYear;

        Car(String carName, Integer carYear) {
            this.carName = carName;
            this.carYear = carYear;
        }
    }
}
