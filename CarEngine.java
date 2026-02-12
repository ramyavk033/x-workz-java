class CarEngine {

    static boolean isStarted;

    static boolean onOrOff() {
        if(isStarted == false) {
            isStarted = true;
            System.out.println("The Car Engine is started...");
        } else if(isStarted == true) {
            isStarted = false;
            System.out.println("The Car Engine is stopped...");
        }
        return isStarted;
    }
}


