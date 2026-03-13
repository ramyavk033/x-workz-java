class Bucket {

    String brand;
    String color;
    int capacity;
    double price;
    boolean handle;

    Bucket(){
        System.out.println("Default Bucket constructor");
    }

    Bucket(String brand,String color,int capacity,double price,boolean handle){
        this.brand=brand;
        this.color=color;
        this.capacity=capacity;
        this.price=price;
        this.handle=handle;
        System.out.println("Parameterized Bucket constructor");
    }
}