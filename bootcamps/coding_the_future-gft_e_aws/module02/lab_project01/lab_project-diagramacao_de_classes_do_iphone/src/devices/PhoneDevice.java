package devices;

import interfaces.Phone;

public class PhoneDevice implements Phone {
    @Override
    public void call() {
        System.out.println("Phone Device\nCalling...");
    }

    @Override
    public void finishCall() {
        System.out.println("Phone Device\nFinishing call.");
    }
}
