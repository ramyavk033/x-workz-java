public class FoodExecutor {

    public static void main(String[] args) {

        Food.createFood("Pizza","Veg",250,300,true);
        Food.getFoodDetails();

        Food.createFood("Burger","Non-Veg",150,450,false);
        Food.getFoodDetails();

        Food.createFood("Pasta","Veg",200,350,false);
        Food.getFoodDetails();

        Food.createFood("Sushi","Non-Veg",500,200,false);
        Food.getFoodDetails();

        Food.createFood("Salad","Vegan",120,150,false);
        Food.getFoodDetails();

        Food.createFood("Tacos","Veg",180,250,true);
        Food.getFoodDetails();

        Food.createFood("Fried Rice","Veg",150,400,true);
        Food.getFoodDetails();

        Food.createFood("Chicken Curry","Non-Veg",300,500,true);
        Food.getFoodDetails();

        Food.createFood("Paneer Butter Masala","Veg",220,450,true);
        Food.getFoodDetails();

        Food.createFood("Ice Cream","Veg",100,200,false);
        Food.getFoodDetails();
    }
}