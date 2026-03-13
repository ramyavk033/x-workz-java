class Bangle {

    int size;

    Bangle(){
        System.out.println("Default constructor called");
    }

    Bangle(int size){
        this.size=size;
        System.out.println("Parameterized constructor called");
    }
}