class MusicPlayer {

    static boolean isPlaying;

    static boolean onOrOff() {
        if(isPlaying == false) {
            isPlaying = true;
            System.out.println("Music is playing...");
        } else if(isPlaying == true) {
            isPlaying = false;
            System.out.println("Music is paused...");
        }
        return isPlaying;
    }
}


