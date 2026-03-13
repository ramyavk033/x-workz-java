class Anklet {

    int weight;

    Anklet(){
        System.out.println("Default Anklet constructor called");
    }

    Anklet(int weight){
        this.weight = weight;
        System.out.println("Parameterized Anklet constructor called");
    }
}