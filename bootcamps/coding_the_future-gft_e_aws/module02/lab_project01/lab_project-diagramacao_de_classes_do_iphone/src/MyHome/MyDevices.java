package MyHome;

import devices.Computer;
import devices.IPhone;
import devices.IPod;
import devices.PhoneDevice;

public class MyDevices {
    public static void main(String[] args) {
        Computer computer = new Computer();
        IPhone iPhone = new IPhone();
        IPod iPod = new IPod();
        PhoneDevice phoneDevice = new PhoneDevice();

        System.out.println("Using my Personal Computer...");
        computer.play();
        computer.pause();
        computer.access();
        computer.play();
        computer.stop();

        System.out.println();
        System.out.println("Using my iPhone...");
        iPhone.call();
        iPhone.finishCall();
        iPhone.access();
        iPhone.play();
        iPhone.stop();

        System.out.println();
        System.out.println("Using my iPod...");
        iPod.play();
        iPod.pause();
        iPod.stop();

        System.out.println();
        System.out.println("Using my Phone Device...");
        phoneDevice.call();
        System.out.println("3 hours later...");
        phoneDevice.finishCall();
    }
}
