package Constructors;

public class Constructors {
    public static void main(String[] args) {

        Human human1 = new Human("Rick", 65, 70.0);
        Human human2 = new Human("John", 35, 62.0);

        System.out.println(human1.name);
        System.out.println(human2.age + "\n");

        human2.eat();
        human1.drink();
    }

    public static class Human {

        String name;
        int age;
        double weight;

        Human(String name, int age, double weight) {

            this.name = name;
            this.age = age;
            this.weight = weight;

        }

        void eat() {
            System.out.println(this.name + " is eating");
        }

        void drink() {
            System.out.println(this.name + " is drinking");
        }
    }
}