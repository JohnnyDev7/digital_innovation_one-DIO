package devices;

import interfaces.Audio;
import interfaces.Internet;

public class Computer implements Audio, Internet {
    @Override
    public void play() {
        System.out.println("Media Player\nPlaying song.");
    }

    @Override
    public void pause() {
        System.out.println("Media Player\nSong paused.");
    }

    @Override
    public void stop() {
        System.out.println("Media Player\nStopping song.");
    }

    @Override
    public void access() {
        System.out.println("Computer Web Browser\nAccessing internet...");
    }
}
