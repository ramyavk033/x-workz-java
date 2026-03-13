class AntExecutor {

    public static void main(String[] args) {

        Ant a1 = new Ant();
        a1.color="Black";
        a1.legs=6;
        a1.size=1.1;

        System.out.println(a1.color+" "+a1.legs+" "+a1.size);

        Ant a2 = new Ant("Red",6,1.3);
        System.out.println(a2.color+" "+a2.legs+" "+a2.size);

        // create up to 25 default and 25 parameterized
    }
}