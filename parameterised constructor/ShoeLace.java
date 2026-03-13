class ShoeLace {

    int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10;

    ShoeLace(){
        System.out.println("Default constructor called");
    }

    ShoeLace(int v1,int v2,int v3,int v4,int v5,
             int v6,int v7,int v8,int v9,int v10){

        this.v1=v1; this.v2=v2; this.v3=v3; this.v4=v4; this.v5=v5;
        this.v6=v6; this.v7=v7; this.v8=v8; this.v9=v9; this.v10=v10;

        System.out.println("Parameterized constructor called");
    }
}