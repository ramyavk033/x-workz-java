class Necklace {

    int v1,v2,v3,v4,v5,v6,v7,v8,v9,v10,
        v11,v12,v13,v14,v15,v16,v17,v18,v19,v20;

    Necklace(){
        System.out.println("Default constructor called");
    }

    Necklace(int v1,int v2,int v3,int v4,int v5,
             int v6,int v7,int v8,int v9,int v10,
             int v11,int v12,int v13,int v14,int v15,
             int v16,int v17,int v18,int v19,int v20){

        this.v1=v1; this.v2=v2; this.v3=v3; this.v4=v4; this.v5=v5;
        this.v6=v6; this.v7=v7; this.v8=v8; this.v9=v9; this.v10=v10;
        this.v11=v11; this.v12=v12; this.v13=v13; this.v14=v14; this.v15=v15;
        this.v16=v16; this.v17=v17; this.v18=v18; this.v19=v19; this.v20=v20;

        System.out.println("Parameterized constructor called");
    }
}