package Recursion;

public class RecursionPower {
    public static void main(String[] args) {
        RecursionPower r = new RecursionPower();
        System.out.println(r.power(2,3)); //Output: 8
    }

    int power(int a, int b) {
        if (b==0) { //stopping case
            return 1;
        }
        return power(a,b-1) * a;
    }
}
