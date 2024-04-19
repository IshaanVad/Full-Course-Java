package Constructors;

import java.util.Scanner;

public class moreConstructorsPractice {
    static boolean tf = true;
    static boolean tf2 = true;
    static boolean tf3 = true;

    public static void main(String[] args) {

        String[] drinkMenu = {"Sprite", "Coca-Cola", "Pepsi", "Fanta"};
        String[] entreeMenu = {"Cheeseburger", "Hamburger", "Grilled Cheese"};
        String[] sideMenu = {"French Fries", "Mac-n-Cheese", "Mash Potatoes"};

        Scanner userDrink = new Scanner(System.in);

        System.out.println("Sprite, Coca-Cola, Pepsi, Fanta");
        System.out.print("What drink would you like? ");
        String drink = userDrink.nextLine();

        /*while (tf) {
            if (drink.equals(drinkMenu)) {
                break;
            } else {
                tf = false;
            }
        }*/

        System.out.println("Cheeseburger, Hamburger, Grilled Cheese");
        System.out.print("What entree would you like? ");
        String entree = userDrink.nextLine();

        /*while (tf2) {
            if (entree.equals(entreeMenu)) {
                break;
            } else {
                tf2 = false;
            }
        }*/

        System.out.println("French Fries, Mac-n-Cheese, Mash Potatoes");
        System.out.print("What side would you like? ");
        String side = userDrink.nextLine();

        /*while (tf3) {
            if (side.equals(sideMenu)) {
                break;
            } else {
                tf3 = false;
            }
        }*/

        RestaurantMenu menu = new RestaurantMenu(drink, entree, side);
        System.out.println("Your order consists of a " + menu.drink + ", a " + menu.entree + ", a " + menu.side);

    }

    static class RestaurantMenu {

        String drink;
        String entree;
        String side;

        RestaurantMenu(String drink, String entree, String side) {
            this.drink = drink;
            this.entree = entree;
            this.side = side;
        }
    }
}
