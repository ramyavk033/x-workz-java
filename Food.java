class Food {

    static String name;
    static String type;       
    static double price;      
    static int calories;      
    static boolean isSpicy;   

    
    public static void createFood(String n, String t, double p, int cal, boolean spicy) {
        name = n;
        type = t;
        price = p;
        calories = cal;
        isSpicy = spicy;
    }

    public static void getFoodDetails() {
        System.out.println("Food Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Calories: " + calories + " kcal");
        System.out.println("Spicy: " + isSpicy);
        System.out.println("----------------------------------");
    }
}