package Constructors;

public class foodConstructor {
    public static void main(String[] args) {

        //javaScrap.Food[] refrigerator = new javaScrap.Food[3];

        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 = new Food("hotdog");

        Food[] refrigerator = {food1, food2, food3};

        //refrigerator[0] = food1;
        //refrigerator[1] = food2;
        //refrigerator[2] = food3;

        System.out.println(refrigerator[2].name);
    }

    public static class Food {

        String name;

        Food(String name){
            this.name = name;
        }
    }
}
