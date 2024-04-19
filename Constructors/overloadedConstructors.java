package Constructors;

public class overloadedConstructors {
    public static void main(String[] args) {

        sandwhich sandwhich = new sandwhich("Whole Grain", "Ham");

        System.out.println("Here are your ingredients: ");
        System.out.println(sandwhich.bread);
        System.out.println(sandwhich.sauce);
        System.out.println(sandwhich.meat);

    }

    public static class sandwhich {

        String bread;
        String sauce;
        String meat;

        sandwhich(String bread, String sauce, String meat) {

            this.bread = bread;
            this.sauce = sauce;
            this.meat = meat;
        }
        sandwhich(String bread, String meat){
            this.bread = bread;
            this.meat = meat;
        }
    }
}
