package inheritance;

import java.util.ArrayList;

public class Food_Test {
    public static void main(String[] args) {

        Food food1 = new Food();
        food1.taste = "delicious";
        food1.name = "Sushi";
        food1.isSpicy = true;
        food1.setOrganic(true);

        System.out.println(food1);
        System.out.println(food1.name);
        System.out.println(food1.isOrganic());

              Vegetable vegetable1 = new Vegetable();

              vegetable1.name = "parsley";
              vegetable1.taste = "good";
              vegetable1.isSpicy = false;
              vegetable1.setOrganic(true);
              vegetable1.color = "green";

        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic());
        System.out.println(vegetable1);

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";

        System.out.println(vegetable2);

        ArrayList<Food> listOfFoods = new ArrayList<>();
        listOfFoods.add(food1);
        listOfFoods.add(vegetable1);
        listOfFoods.add(vegetable2);

        int count = 0;
        for(Food food : listOfFoods){
            if(food.name.length() > 5) count++;
        }
        System.out.println(count);






    }
}
