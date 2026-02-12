class DoorLock {

    static boolean isLocked;

    static boolean onOrOff() {
        if(isLocked == false) {
            isLocked = true;
            System.out.println("The Door is locked...");
        } else if(isLocked == true) {
            isLocked = false;
            System.out.println("The Door is unlocked...");
        }
        return isLocked;
    }
}


