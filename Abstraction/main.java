package Abstraction;

public class main {
    public static void main(String[] args){

        //abstract = abstract Encapsulation.classes cannot be instantiated, but they can have a subclass
        //           abstract methods are declared without an implementation

        //Vehicle vehicle = new Vehicle(); #cannot make instance due to abstraction
        //                                 #Encapsulation.main point of this is to add a layer of extra protection

        Car car = new Car();

        car.go();

    }
}
