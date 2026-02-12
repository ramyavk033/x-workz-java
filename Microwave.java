class Microwave {

    static boolean isRunning;

    static boolean onOrOff() {
        if(isRunning == false) {
            isRunning = true;
            System.out.println("Microwave is running...");
        } else if(isRunning == true) {
            isRunning = false;
            System.out.println("Microwave is stopped...");
        }
        return isRunning;
    }
}


