package Polymorphism;

public class Main {
    public static void main(String[] args) {

        //polymorphism = the ability of an object to identify as more than one type

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bicycle, boat};

        for (Vehicle x : racers) {
            x.go();
        }
    }
}
