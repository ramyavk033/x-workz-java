class HelmetExecutor {

    public static void main(String[] args) {

        Helmet h1 = new Helmet();
        h1.brand="Vega";
        h1.color="Black";
        h1.price=1500;

        System.out.println(h1.brand+" "+h1.color+" "+h1.price);

        Helmet h2 = new Helmet("Studds","Red",2000);

        System.out.println(h2.brand+" "+h2.color+" "+h2.price);

    }
}