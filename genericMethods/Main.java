package genericMethods;

public class Main {
    public static void main(String[] args) {

        // generics = enable types (classes interfaces) to be parameters when defining:
        //            classes, interfaces, and methods
        //            A benefit is to eliminate the need to create multiple versions
        //            of methods or classes for various data types.
        //            In short, use 1 version for all reference data types.

        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {5.5, 4.4, 3.3, 2.2, 1.1};
        Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};
        String[] stringArray = {"B", "Y", "E"};

        displayArray(intArray);
        displayArray(doubleArray);
        displayArray(characterArray);
        displayArray(stringArray);

        System.out.println(getFirst(intArray));
        System.out.println(getFirst(doubleArray));
        System.out.println(getFirst(characterArray));
        System.out.println(getFirst(stringArray));

    }

    public static <T> void displayArray(T[] array) { //T = Thing ... <T> needs to be before void
        for (T x : array) {
            System.out.println(x + " ");
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] array){
        return array[0]; //index of 0, so first one in the array
    }

}