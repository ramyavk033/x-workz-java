class Camera {

    static String brand;
    static String model;
    static double price;
    static int megapixel;
    static boolean isDigital;
    static String color;
    static int zoom;
    static boolean hasFlash;
    static String sensorType;
    static double weight;

    public static void createCamera(String b, String m, double p, int mp,
                                    boolean digital, String c, int z,
                                    boolean flash, String sensor, double w) {

        brand = b;
        model = m;
        price = p;
        megapixel = mp;
        isDigital = digital;
        color = c;
        zoom = z;
        hasFlash = flash;
        sensorType = sensor;
        weight = w;
    }

    public static void getCameraDetails() {

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Megapixel: " + megapixel);
        System.out.println("Digital: " + isDigital);
        System.out.println("Color: " + color);
        System.out.println("Zoom: " + zoom + "x");
        System.out.println("Flash: " + hasFlash);
        System.out.println("Sensor Type: " + sensorType);
        System.out.println("Weight: " + weight + "g");
        System.out.println("----------------------------------");
    }
}