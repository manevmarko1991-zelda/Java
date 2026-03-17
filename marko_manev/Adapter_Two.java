package marko_manev;

// Interface (Ziel)
interface TwoPinSocket2 {
    void plugIn();
}

// Adaptee (dreipoliges Gerät)
class ThreePinDevice2 {
    public void connect() {
        System.out.println("Dreipoliges Ladegeraet ist verbunden.");
    }
}

// Spezielles Gerät
class SimpleLamp2 extends ThreePinDevice2 {
    @Override
    public void connect() {
        System.out.println("Lampe mit dreipoligem Stecker ist verbunden.");
    }
}

// Adapter
class SocketAdapter2 implements TwoPinSocket2 {
    private ThreePinDevice2 device;

    public SocketAdapter2(ThreePinDevice2 device) {
        this.device = device;
    }

    @Override
    public void plugIn() {
        device.connect();
    }
}

// Main-Klasse
public class Adapter_Two {

    public static void main(String[] args) {

        ThreePinDevice2 laptopCharger = new ThreePinDevice2();
        ThreePinDevice2 lamp = new SimpleLamp2();

        TwoPinSocket2 adapter1 = new SocketAdapter2(laptopCharger);
        TwoPinSocket2 adapter2 = new SocketAdapter2(lamp);

        adapter1.plugIn();
        adapter2.plugIn();
    }
}