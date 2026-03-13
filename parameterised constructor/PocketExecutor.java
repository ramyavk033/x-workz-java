class PocketExecutor {

    public static void main(String[] args) {

        Pocket p1 = new Pocket();
        p1.type="Shirt";
        p1.size=5;
        p1.color="Blue";

        System.out.println(p1.type+" "+p1.size+" "+p1.color);

        Pocket p2 = new Pocket("Pant",6,"Black");

        System.out.println(p2.type+" "+p2.size+" "+p2.color);
    }
}