class Ant {

    String color;
    int legs;
    double size;

    Ant(){
        System.out.println("Default Ant constructor");
    }

    Ant(String color,int legs,double size){
        this.color=color;
        this.legs=legs;
        this.size=size;
        System.out.println("Parameterized Ant constructor");
    }
}