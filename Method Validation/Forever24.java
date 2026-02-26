class Forever24 {

    static String brand;
    static String type;          
    static String size;          
    static String color;
    static String material;      
    static double price;
    static boolean isUnisex;
    static String pattern;       
    static String sleeveType;    
    static String fit;           
    static boolean washable;     
    static int stock;            

    
    public static void createCloth(String b, String t, String s, String c, String m,
                                   double p, boolean unisex, String pat, String sleeve,
                                   String fitType, boolean wash, int st) {
        brand = b;
        type = t;
        size = s;
        color = c;
        material = m;
        price = p;
        isUnisex = unisex;
        pattern = pat;
        sleeveType = sleeve;
        fit = fitType;
        washable = wash;
        stock = st;
    }

    public static void getCloth() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Price: " + price);
        System.out.println("Unisex: " + isUnisex);
        System.out.println("Pattern: " + pattern);
        System.out.println("Sleeve Type: " + sleeveType);
        System.out.println("Fit: " + fit);
        System.out.println("Washable: " + washable);
        System.out.println("Stock: " + stock);
        System.out.println("----------------------------------");
    }
}