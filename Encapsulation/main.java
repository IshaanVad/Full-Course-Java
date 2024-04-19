package Encapsulation;

public class main {
    public static void main(String[] args) {

        classes class1 = new classes("AP Stats", 8, 4.65);

        class1.setClassName("AP Psych");

        System.out.println(class1.getClassName()); //changed AP Stats to AP Psych due to setter in 'classes' class

    }
}
