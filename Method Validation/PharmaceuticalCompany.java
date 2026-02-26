class PharmaceuticalCompany {

    static String companyName;
    static String medicineName;
    static String type;          
    static double price;
    static double dosage;        
    static int expiryYear;
    static boolean prescriptionRequired;
    static int stock;            
    static String manufacturer;  

    
    public static void createMedicine(String cName, String mName, String t,
                                      double p, double d, int expYear,
                                      boolean prescription, int stk, String manuf) {
        companyName = cName;
        medicineName = mName;
        type = t;
        price = p;
        dosage = d;
        expiryYear = expYear;
        prescriptionRequired = prescription;
        stock = stk;
        manufacturer = manuf;
    }

    public static void getMedicine() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Dosage: " + dosage + (type.equalsIgnoreCase("Syrup") ? " ml" : " mg"));
        System.out.println("Expiry Year: " + expiryYear);
        System.out.println("Prescription Required: " + prescriptionRequired);
        System.out.println("Stock: " + stock);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("----------------------------------");
    }
}