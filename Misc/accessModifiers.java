package Misc;

public class accessModifiers {

    public String publicMessage = "This is a public message";
    //can be called in any package within the project folder
    //-public access modifier

    protected String protectedMessage = "This is protected";
    //can be called in a different class within a different package
    //as long as the class is a subclass of whatever class
    //has the protected member
    //-protected modifier

    private String privateMessage = "This is private";
    //can be only called in the class it's within
    //-private modifier

    String defaultMessage = "This is the default message";
    //can only be called upon within the package
    //-no modifier
}
