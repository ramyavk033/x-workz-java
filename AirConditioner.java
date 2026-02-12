class AirConditioner {

    static boolean isOn;

    static boolean onOrOff() {
        if(isOn == false) {
            isOn = true;
            System.out.println("The Air Conditioner is turned on...");
        } else if(isOn == true) {
            isOn = false;
            System.out.println("The Air Conditioner is turned off...");
        }
        return isOn;
    }
}

