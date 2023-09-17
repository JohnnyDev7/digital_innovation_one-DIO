package devices;

import interfaces.Audio;

public class IPod implements Audio {

    @Override
    public void play() {
        System.out.println("iPod\nPlaying song.");
    }

    @Override
    public void pause() {
        System.out.println("iPod\nSong paused.");
    }

    @Override
    public void stop() {
        System.out.println("iPdo\nStopping song.");
    }
}
