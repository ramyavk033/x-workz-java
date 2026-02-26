class WashingMachine {

    static String brand;
    static String model;
    static double capacity;   
    static double price;
    static int rpm;           
    static boolean frontLoad;
    static String color;
    static String energyRating;
    static boolean inverter;
    static String washProgram;

   
    public static void createWashingMachine(String b, String m, double cap, double p,
                                            int r, boolean front, String c,
                                            String rating, boolean inv, String program) {
        brand = b;
        model = m;
        capacity = cap;
        price = p;
        rpm = r;
        frontLoad = front;
        color = c;
        energyRating = rating;
        inverter = inv;
        washProgram = program;
    }

    public static void getWashingMachineDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Capacity: " + capacity + " kg");
        System.out.println("Price: " + price);
        System.out.println("RPM: " + rpm);
        System.out.println("Front Load: " + frontLoad);
        System.out.println("Color: " + color);
        System.out.println("Energy Rating: " + energyRating);
        System.out.println("Inverter: " + inverter);
        System.out.println("Wash Program: " + washProgram);
        System.out.println("----------------------------------");
    }
}