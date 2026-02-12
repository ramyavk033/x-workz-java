class Fan {

    static boolean isRunning;

    static boolean onOrOff() {
        if(isRunning == false) {
            isRunning = true;
            System.out.println("The Fan is turned on...");
        } else if(isRunning == true) {
            isRunning = false;
            System.out.println("The Fan is turned off...");
        }
        return isRunning;
    }
}


