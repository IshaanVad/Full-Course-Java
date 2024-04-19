package dynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // polymorphism = multiple objects going into 1 parent class
        //dynamic = after compilation (during runtime)

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("Dog or Cat?");
        String userInput = scanner.nextLine();

        if (userInput.equalsIgnoreCase("dog")) {
            animal = new Dog();
            animal.speak();
        } else if (userInput.equalsIgnoreCase("cat")){
            animal = new Cat();
            animal.speak();
        } else {
            animal = new Animal();
            System.out.println("This choice is invalid");
            animal.speak();
        }
    }
}
