class JacketExecutor {

    public static void main(String[] args) {

        Jacket j1 = new Jacket();
        j1.brand="Puma";
        j1.color="Black";
        j1.size="M";
        j1.price=2500;
        j1.waterproof=true;

        System.out.println(j1.brand+" "+j1.color+" "+j1.size+" "+j1.price+" "+j1.waterproof);

        Jacket j2 = new Jacket("Nike","Blue","L",3000,true);

        System.out.println(j2.brand+" "+j2.color+" "+j2.size+" "+j2.price+" "+j2.waterproof);

    }
}