class App {

    static String name;
    static String developer;
    static double sizeMB;
    static double rating;
    static boolean isFree;
    static String category;
    static int downloads;
    static boolean inAppPurchases;
    static String version;

   
    public static void createApp(String n, String dev, double size, double rate,
                                 boolean free, String cat, int dl, boolean iap, String ver) {

        name = n;
        developer = dev;
        sizeMB = size;
        rating = rate;
        isFree = free;
        category = cat;
        downloads = dl;
        inAppPurchases = iap;
        version = ver;
    }

    public static void getAppDetails() {
        System.out.println("App Name: " + name);
        System.out.println("Developer: " + developer);
        System.out.println("Size (MB): " + sizeMB);
        System.out.println("Rating: " + rating);
        System.out.println("Free: " + isFree);
        System.out.println("Category: " + category);
        System.out.println("Downloads: " + downloads);
        System.out.println("In-App Purchases: " + inAppPurchases);
        System.out.println("Version: " + version);
        System.out.println("----------------------------------");
    }
}