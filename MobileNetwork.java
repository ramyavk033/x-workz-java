class MobileNetwork {

    static boolean isConnected;

    static boolean onOrOff() {
        if(isConnected == false) {
            isConnected = true;
            System.out.println("Network is connected...");
        } else if(isConnected == true) {
            isConnected = false;
            System.out.println("Network is disconnected...");
        }
        return isConnected;
    }
}


