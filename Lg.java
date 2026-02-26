class Lg {

  
    static String brand;
    static String model;
    static int capacity;              
    static double price;
    static int warrantyYears;
    static boolean isDoubleDoor;
    static String color;
    static String energyRating;
    static boolean hasFreezer;
    static String compressorType;


    public static boolean validateRefrigerator(String b, String m,
                                               int cap, double pr,
                                               int warranty, boolean doubleDoor,
                                               String col, String rating,
                                               boolean freezer, String compressor) {

       
        brand = null;
        model = null;
        capacity = 0;
        price = 0;
        warrantyYears = 0;
        isDoubleDoor = false;
        color = null;
        energyRating = null;
        hasFreezer = false;
        compressorType = null;

        boolean isValid = true;

        if (b != null && !b.isEmpty()) {
            brand = b;
        } else {
            System.out.println("Invalid Brand");
            isValid = false;
        }

        if (m != null && !m.isEmpty()) {
            model = m;
        } else {
            System.out.println("Invalid Model");
            isValid = false;
        }

        if (cap > 0) {
            capacity = cap;
        } else {
            System.out.println("Invalid Capacity");
            isValid = false;
        }

        if (pr > 0) {
            price = pr;
        } else {
            System.out.println("Invalid Price");
            isValid = false;
        }

        if (warranty >= 0) {
            warrantyYears = warranty;
        } else {
            System.out.println("Invalid Warranty");
            isValid = false;
        }

        isDoubleDoor = doubleDoor;

        if (col != null && !col.isEmpty()) {
            color = col;
        } else {
            System.out.println("Invalid Color");
            isValid = false;
        }

        if (rating != null && !rating.isEmpty()) {
            energyRating = rating;
        } else {
            System.out.println("Invalid Energy Rating");
            isValid = false;
        }

        hasFreezer = freezer;

        if (compressor != null && !compressor.isEmpty()) {
            compressorType = compressor;
        } else {
            System.out.println("Invalid Compressor Type");
            isValid = false;
        }

        return isValid;
    }

   
    public static boolean createRefrigerator(String b, String m,
                                             int cap, double pr,
                                             int warranty, boolean doubleDoor,
                                             String col, String rating,
                                             boolean freezer, String compressor) {

        boolean result = validateRefrigerator(b, m, cap, pr,
                                              warranty, doubleDoor,
                                              col, rating, freezer,
                                              compressor);

        if (result) {
            System.out.println("Refrigerator Added Successfully ");
        } else {
            System.out.println("Refrigerator Creation Failed ");
        }

        return result;
    }

  
    public static void getRefrigeratorDetails() {

        System.out.println("------ Refrigerator Details ------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity + " Litres");
        System.out.println("Price: ₹" + price);
        System.out.println("Warranty: " + warrantyYears + " Years");
        System.out.println("Double Door: " + isDoubleDoor);
        System.out.println("Color: " + color);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Has Freezer: " + hasFreezer);
        System.out.println("Compressor Type: " + compressorType);
        System.out.println("-----------------------------------\n");
    }
}