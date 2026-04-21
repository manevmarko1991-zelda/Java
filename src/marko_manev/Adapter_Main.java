package marko_manev;
//Ziel-Interface: Zweipolige Steckdose
interface TwoPinSocket {
 void plugIn();
}

//Adaptee: Dreipoliges Gerät
class ThreePinDevice {
 public void connect() {
     System.out.println("Dreipoliges Geraet ist verbunden.");
 }
}

//Adapter: Macht das dreipolige Gerät kompatibel mit der zweipoligen Steckdose
class SocketAdapter implements TwoPinSocket {
 private ThreePinDevice device;

 public SocketAdapter(ThreePinDevice device) {
     this.device = device;
 }

 @Override
 public void plugIn() {
     device.connect();  // Verwendet die Methode des dreipoligen Geräts
 }
}

//Main-Klasse zum Testen
public class Adapter_Main {
 public static void main(String[] args) {
     // Dreipoliges Gerät
     ThreePinDevice laptopCharger = new ThreePinDevice();

     // Adapter, der es mit einer Zweipol-Steckdose kompatibel macht
     TwoPinSocket adapter = new SocketAdapter(laptopCharger);

     // Nun kann das dreipolige Gerät in die zweipolige Steckdose eingesteckt werden
     adapter.plugIn();
 }
}