class CoffeeExecutor {

    public static void main(String[] args) {

        System.out.println("Default Constructor Objects");

        Coffee c1 = new Coffee();
        c1.brand = "Bru";
        c1.price = 10;
        System.out.println(c1.brand + " " + c1.price);

        Coffee c2 = new Coffee();
        c2.brand = "Nescafe";
        c2.price = 20;
        System.out.println(c2.brand + " " + c2.price);

        

        System.out.println("Parameterized Constructor Objects");

        Coffee p1 = new Coffee("Bru",30);
        System.out.println(p1.brand + " " + p1.price);

        Coffee p2 = new Coffee("Nescafe",40);
        System.out.println(p2.brand + " " + p2.price);

        
    }
}