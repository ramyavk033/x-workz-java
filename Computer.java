class Computer {

    static boolean isOn;

    static boolean onOrOff() {
        if(isOn == false) {
            isOn = true;
            System.out.println("Computer is turned on...");
        } else if(isOn == true) {
            isOn = false;
            System.out.println("Computer is turned off...");
        }
        return isOn;
    }
}


