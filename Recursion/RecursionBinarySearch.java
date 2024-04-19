package Recursion;

import java.util.ArrayList;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        RecursionBinarySearch x = new RecursionBinarySearch();
        Comparable[] a = {1, 2, 3, 4, 5}; //3rd index
        System.out.println(x.binarySearch(a, 4)); //Output: 3
    }
    int binarySearch(Comparable[] a, Comparable value) {
        return helper(a,value,0,a.length-1);
    }
    private int helper(Comparable[] a, Comparable value, int low, int high) {
        if (low > high) {
            throw new RuntimeException("Not Found");
        }
        int middleIndex = (low+high)/2;
        int result = a[middleIndex].compareTo(value);
        if (result == 0) {
            return middleIndex;
        } else if (result < 0) {
            return helper(a, value, middleIndex+1, high);
        } else {
            return helper(a, value, low, middleIndex - 1);
        }
    }
}