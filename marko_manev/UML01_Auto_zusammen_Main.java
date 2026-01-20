package marko_manev;

public class UML01_Auto_zusammen_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		UML01_Auto_zusammen golf2 = new UML01_Auto_zusammen();
		// Das erste Auto gibt die Klasse an, aus der ein Objekt erzeugt werden soll
		// meinAuto ist ein Bezeichner, es gelten die allgemeinen Beschränkungen für Bezeichner
		// new ist ein Schlüsselwort in Java, das eine Instanz erstellt
		// Auto() ist eine Methode, genauer ein Konstruktor, also eine Methode, die beim erzeugen 
		// der Instanz aufgerufen wird. Wenn die Methode nicht in der Klasse existiert, gibt es
		// eine Standardmethode dafür.
		
		golf2.marke = "VW";
		golf2.modell = "Golf 2";
		golf2.getriebe = "Schalter";
		golf2.motorps = 90;
		golf2.achsen = 2;
		golf2.anzahlTueren = 3;
		
		System.out.println("Mein Auto ist von der Marke "+ golf2.marke);
		System.out.println("Das Modell ist ein "+ golf2.modell);
		System.out.println("Dies ist ein "+ golf2.getriebe);
		System.out.println("Das Auto hat "+ golf2.motorps);
		System.out.println("Baujahr des Autos ist "+ golf2.baujahr);
		
		golf2.beschleunigen();
		
		System.out.println("      ");
		
		UML01_Auto_zusammen nissan_almera = new UML01_Auto_zusammen();
			
		
		nissan_almera.marke = "Nissan";
		nissan_almera.modell = "Almera";
		nissan_almera.getriebe = "Schalter";
		nissan_almera.motorps = 90;
		nissan_almera.anzahlSitze = 5;
		nissan_almera.anzahlTueren = 5;
		nissan_almera.baujahr = 2003;
		
		System.out.println("Mein Auto ist von der Marke "+ nissan_almera.marke);
		System.out.println("Das Modell ist ein "+ nissan_almera.modell);
		System.out.println("Dies ist ein "+ nissan_almera.getriebe);
		System.out.println("Das Auto hat "+ nissan_almera.motorps);
		System.out.println("Baujahr des Autos ist "+ nissan_almera.baujahr);

		System.out.println(nissan_almera.hupen());

	}

}
