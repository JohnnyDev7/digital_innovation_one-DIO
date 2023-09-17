package devices;

import interfaces.Audio;
import interfaces.Internet;
import interfaces.Phone;

public class IPhone implements Audio, Internet, Phone {
    @Override
    public void play() {
        System.out.println("iPhone\nPlaying song.");
    }

    @Override
    public void pause() {
        System.out.println("iPhone\nSong paused.");
    }

    @Override
    public void stop() {
        System.out.println("iPhone\nStopping song.");
    }

    @Override
    public void access() {
        System.out.println("iPhone\nAccessing internet...");
    }

    @Override
    public void call() {
        System.out.println("iPhone\nCalling...");
    }

    @Override
    public void finishCall() {
        System.out.println("iPhone\nFinishing call.");
    }
}
