package Recursion;

public class RecursionSumOfArrayInts {
    public static void main(String[] args) {
        RecursionSumOfArrayInts x = new RecursionSumOfArrayInts();
        int[] a = {1,2,3,4,5}; //sum is 15
        System.out.println(x.sum(a));
    }
    int sum(int[] a) {
        return helperSum(a, 0);
    }
    private int helperSum (int[] a, int pos) {
        if (pos == a.length) {
            return 0;
        }
        return a[pos] + helperSum(a, pos+1);
    }
}
