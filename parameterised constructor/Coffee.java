class Coffee {

    String brand;
    int price;

    Coffee(){
        System.out.println("Default Coffee constructor");
    }

    Coffee(String brand, int price){
        this.brand = brand;
        this.price = price;
        System.out.println("Parameterized Coffee constructor");
    }
}