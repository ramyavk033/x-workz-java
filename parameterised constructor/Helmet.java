class Helmet {

    String brand;
    String color;
    double price;

    Helmet(){
        System.out.println("Default constructor called");
    }

    Helmet(String brand,String color,double price){
        this.brand=brand;
        this.color=color;
        this.price=price;
        System.out.println("Parameterized constructor called");
    }
}