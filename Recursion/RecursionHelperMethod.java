package Recursion;

public class RecursionHelperMethod {
    public static void main(String[] args) {
        System.out.println(isPresent("abcdef", 'b')); //should return true
        System.out.println(isPresent("abcdef", 'R')); //should return false
    }
    public static boolean isPresent(String s, char c) {
        return isPresentHelper(s, c,0);
    }
    private static boolean isPresentHelper(String s, char c, int pos) {
        if (pos == s.length()) {
            return false;
        }
        boolean partAnswer = isPresentHelper(s, c, pos + 1);
        if (partAnswer) {
            return true;
        }
        return s.charAt(pos) == c;
    }
}
