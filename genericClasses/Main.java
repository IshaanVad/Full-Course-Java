package genericClasses;

public class Main {
    public static void main(String[] args) {

        myGenericClass<Integer,Integer> myInt = new myGenericClass<>(1, 2);
        myGenericClass<Double,Double> myDouble = new myGenericClass<>(3.14, 9.14);
        myGenericClass<Character,Character> myChar = new myGenericClass<>('@', '#');
        myGenericClass<String,Character> myString = new myGenericClass<>("Hello", '%');

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());
    }
}
