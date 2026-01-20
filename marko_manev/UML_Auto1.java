package marko_manev;

public class UML_Auto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			UML_AutoWork golf2 = new UML_AutoWork();
			// das erste Auto gibt die Klasse an aus der ein Objekt erzeugt werden soll
			// meinAuto ist ein Bezeichner, es gelten die allgemeinen Beschränkungen für Bezeichner
			// new ist ein Schlüsselwort in Java, das eine Instanz erstellt
			// Auto() ist eine Methode, genauer ein Konstruktor, also eine Methode die beim
			// erzeugen der Instanz aufgerufen wird, wenn die Methode nicht in der Klasse existiert
			// gibt es eine Standardmethode dafür
			
			
			
			
			
			
			  // 2. Werte zuweisen (Parameter eingeben)
	        golf2.marke = "VW";
	        golf2.modell = "Golf 2";
	        golf2.getriebe = "Schalter";
	        golf2.motorps = 90.0;
	        golf2.baujahr = 1991;
	        golf2.Tueren = 3;
	        
	        // 3. Die Ausgabe aufrufen
	        golf2.printInfo();
	 
	        
	        
	        
	        // Beispiel für ein zweites Auto:
	        UML_AutoWork bmw = new UML_AutoWork();
	        bmw.marke = "BMW";
	        bmw.modell = "M3";
	        bmw.motorps = 343;
	        
	        bmw.printInfo(); // Erzeugt automatisch das gleiche Layout mit den BMW-Daten
	        
	        
	        
	        UML_AutoWork impreza = new UML_AutoWork();
	        impreza.marke = "SUBARU";
	        impreza.modell = "IMPREZA";
	        impreza.motorps = 300;
	        impreza.baujahr = 2018;
	        impreza.hubraum = 2457;
	        impreza.getriebe = "Schalter";
	        impreza.Tueren = 5;
	        
	        impreza.printInfo();
	        
	        
	        
	        UML_AutoWork LexusNXawd = new UML_AutoWork();
	        LexusNXawd.marke = "TOYOTA";
	        LexusNXawd.modell = "Lexus NX AWD";
	        LexusNXawd.motorps = 275;
	        LexusNXawd.baujahr = 2026;
	        LexusNXawd.hubraum = 2487;
	        LexusNXawd.getriebe = "Automatik";
	        LexusNXawd.Tueren = 5;
	        LexusNXawd.antriebsart = "Allrad";
	        LexusNXawd.ausstattung = "Deluxe";
	        LexusNXawd.farbe = "Anthrazit Metallic";
	        LexusNXawd.gewicht = 2400;
	        LexusNXawd.kilometerstand = 50;
	        LexusNXawd.kraftstoffart = "Benzin";
	        LexusNXawd.maxGeschwindigkeit = 200;
	        LexusNXawd.preis = "60.000";
	                
	        LexusNXawd.printInfo();
	 
	        
	                
	        UML_AutoWork AudiA3 = new UML_AutoWork();
	        AudiA3.marke = "AUDI";
	        AudiA3.modell = "A3 Sportback Quattro";
	        AudiA3.motorps = 190;
	        AudiA3.baujahr = 2017;
	        AudiA3.hubraum = 1984;
	        AudiA3.getriebe = "Automatik";
	        AudiA3.Tueren = 5;
	        AudiA3.antriebsart = "Allrad";
	        AudiA3.ausstattung = "Vollausstattung";
	        AudiA3.farbe = "Kosmosblau";
	        AudiA3.gewicht = 1460;
	        AudiA3.kilometerstand = 68500;
	        AudiA3.kraftstoffart = "Benzin";
	        AudiA3.maxGeschwindigkeit = 240;
	        AudiA3.preis = "23.600";
	                
	        AudiA3.printInfo();
	        
	        
	        
	       // System.out.println(SupraGT4.modelljahr); - noch zu testen        
	 
		}
	 
	}