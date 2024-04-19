package overridingMethods;

public class Dog extends Animal {

    @Override //Good practice
    void speak() { //Overrided overridingMethods.Animal's code
        System.out.println("The dog barks");
    }
}
