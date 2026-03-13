class Pocket {

    String type;
    int size;
    String color;

    Pocket(){
        System.out.println("Default constructor called");
    }

    Pocket(String type,int size,String color){
        this.type=type;
        this.size=size;
        this.color=color;
        System.out.println("Parameterized constructor called");
    }
}