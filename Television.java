class Television {

    static boolean isOn;

    static boolean onOrOff() {
        if(isOn == false) {
            isOn = true;
            System.out.println("The Television is turned on...");
        } else if(isOn == true) {
            isOn = false;
            System.out.println("The Television is turned off...");
        }
        return isOn;
    }
}


