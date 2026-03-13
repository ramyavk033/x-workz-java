class Blanket {

    String brand;
    String color;
    int size;
    double price;
    boolean warm;
    String material;

    Blanket(){
        System.out.println("Default constructor called");
    }

    Blanket(String brand,String color,int size,double price,boolean warm,String material){

        this.brand=brand;
        this.color=color;
        this.size=size;
        this.price=price;
        this.warm=warm;
        this.material=material;

        System.out.println("Parameterized constructor called");
    }
}