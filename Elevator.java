class Elevator {

    static String brand;
    static int maxCapacity;      
    static int currentFloor;
    static int totalFloors;
    static boolean isOperational;
    static String type;           
    static double speed;          

    
    public static void createElevator(String b, int maxCap, int current, int total,
                                      boolean operational, String t, double s) {
        brand = b;
        maxCapacity = maxCap;
        currentFloor = current;
        totalFloors = total;
        isOperational = operational;
        type = t;
        speed = s;
    }

    public static void getElevatorDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Max Capacity: " + maxCapacity + " kg");
        System.out.println("Current Floor: " + currentFloor);
        System.out.println("Total Floors: " + totalFloors);
        System.out.println("Operational: " + isOperational);
        System.out.println("Type: " + type);
        System.out.println("Speed: " + speed + " m/s");
        System.out.println("----------------------------------");
    }
}