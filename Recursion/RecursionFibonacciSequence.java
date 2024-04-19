package Recursion;

public class RecursionFibonacciSequence {
    public static void main(String[] args) {
        RecursionFibonacciSequence x = new RecursionFibonacciSequence();
        System.out.println(x.fib(5));
    }
    int fib(int n) {
        if (n < 2) { //if 0 or 1 index, return 1
            return 1;
        }
        int x = fib(n-2); //first clone
        int y = fib(n-1); //second clone
        return x + y;
    }
}
