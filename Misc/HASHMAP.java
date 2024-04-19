package Misc;

import java.util.HashMap;

public class HASHMAP {
    public static void main(String[] args) {

        HashMap<Integer, String> countries = new HashMap<>();

        countries.put(1, "United States of America");
        countries.put(2, "United Kingdom");

        System.out.println(countries); //whole HashMap
        System.out.println(countries.keySet()); //displays all keys
        System.out.println(countries.values()); //displays all values
        System.out.println(countries.get(1)); //displays specific key (in this case, United States of America)
        System.out.println(countries.containsValue("UK")); //false
    }
}