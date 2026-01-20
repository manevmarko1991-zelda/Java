package marko_manev;

public class UML02_Konto_zusammen {
	
	// Attribute
	
	String inhaber;
	String iban;
	double kontostand;
	boolean gesperrt;
	
	// Methoden
	
	// Konstruktor defineren:
	
	// Um ein Objekt zu erzeugen benötige ich einen Konstruktor
	// Java hat einen Standartkonstruktor, wenn wir diesen selber nicht definieren
	// Konstruktor sind die EINZIGE Methode, die KEINEN Datentyp braucht
	
	// eigenen Konstruktor definieren
	
	
	public UML02_Konto_zusammen(String inhaber, String iban, double kontostand, boolean gesperrt) {
		this.inhaber = inhaber;
		this.iban = iban;
		this.kontostand = kontostand;
		this.gesperrt = gesperrt;	
		
		// this. bezieht sich auf das Objekt, was gerade ausgewählt oder instanziert wird
		// In diesem Fall (Bsp.): this.inhaber ist das Attribut inhaber vom neu erstellten Objekt
		// Wir kannten den konkreten Bezeichner vom erstellten Objekt nicht => wir machen eine Art Zuweisung
	
	}	
	
	// Wenn ich einmal einen eigenen Konstruktor definiert habe, MUSS ich auch alle weiteren Konstruktor definieren!
	// Java hält in diesem Fall dann KEINEN Standardkonstruktor mehr vor, wir müssen uns folglich einen eigenen bauen!
	
	public UML02_Konto_zusammen() {
	
	// => Nichts anderes, als der eigentliche Standardkonstruktor
		
	}
	
	// Die eigentlichen Methoden von der Klasse Konto
	
	// Unterscheidung:
	// void 		=> tut etwas
	// Rückgabewert => liefert ein Ergebnis & arbeitet immer mit einem Datentypen
	
	// VOID!!!
	
	public void einzahlen(double betrag) {
		if(!this.gesperrt && betrag > 0) {
		this.kontostand += betrag;
		System.out.println("Der Kontostand beträgt jetzt: " + this.kontostand);
		}
		}

	public void auszahlen(double betrag) {
		if(!this.gesperrt && this.kontostand >= betrag && betrag > 0) {
		this.kontostand -= betrag;
		System.out.println("Der Kontostand ist nun " + this.kontostand);
		}
		else {
			System.out.println("Sie haben nicht genug Geld auf dem Konto oder Ihr Konto ist gesperrt - melden Sie sich bei Ihrer Bank!");
		}
		}
	// RÜCKGABEWERT!!!
		
	// Wir erstellen eine Funktion, die den Inhaber rausgibt
		
	public String zeigeInhaber() {
		return this.inhaber;
	
	}
	
	// static
	// Methoden mit static brauchen KEIN Objekt, sie werden direkt auf der Klasse selber ausgeführt
	// Es sind ALLEGEMEINE Methoden für ALLE Objekte, deswegen werden diese auf der Klasse selber ausgeführt
	
	public static double addieren(double plusZahleins, double plusZahlzwei) {
		return plusZahleins + plusZahlzwei;
	}
	
	public static double subtrahieren(double minusZahleins, double minusZahlzwei) {
		return minusZahleins - minusZahlzwei;
	}
}
	