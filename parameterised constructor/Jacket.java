class Jacket {

    String brand;
    String color;
    String size;
    double price;
    boolean waterproof;

    Jacket(){
        System.out.println("Default Jacket constructor");
    }

    Jacket(String brand,String color,String size,double price,boolean waterproof){
        this.brand=brand;
        this.color=color;
        this.size=size;
        this.price=price;
        this.waterproof=waterproof;
        System.out.println("Parameterized Jacket constructor");
    }
}