package Encapsulation;

public class classes {

    private String className; //'private' only can be called within class unless setter and getter is made
    private int numberOfClasses;
    private double GPA;

    classes(String className, int numberOfClasses, double GPA) {
        this.setClassName(className);//part that needs to be changed for a setter
        this.numberOfClasses = numberOfClasses;
        this.GPA = GPA;
    }

    public String getClassName() {
        return className;
    }

    public int getNumberOfClasses() { //getter since private variable
        return numberOfClasses;
    }

    public double getGPA() {
        return GPA;
    }

    public String setClassName(String className) { //how to make a setter
        return this.className = className;
    }
}
