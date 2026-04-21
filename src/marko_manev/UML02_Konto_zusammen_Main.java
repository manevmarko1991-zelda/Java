package marko_manev;

public class UML02_Konto_zusammen_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Kontoobjekt instanzieren
	
	UML02_Konto_zusammen Konto1 = new UML02_Konto_zusammen();
	
	// Standartwerte eingegeben
	Konto1.gesperrt = false;
	Konto1.inhaber = "Marko Manev";
	Konto1.iban = "DE01 1234 5678 9101 112";
	Konto1.kontostand = 0.0;
	
	System.out.println("Der Name des Kontoinhabers ist: " + Konto1.inhaber);
	System.out.println("Die IBAN lautet: " + Konto1.iban);
	System.out.println("Sie haben einen Kontostand in Höhe von: " + Konto1.kontostand);
	System.out.println("Ist das Konto gesperrt? " + Konto1.gesperrt);
	
	// Kontoobjekt instanzieren => Kurzversion
	
	UML02_Konto_zusammen Konto2 = new UML02_Konto_zusammen("Dirk Badstuebner", "DE98 7654 3210 9876 54", 10.0, false);
	
	System.out.println("Der Inhaber des Konto 2 ist : " + Konto2.inhaber);
	
	System.out.println(" ");
	
	System.out.println("Geld einzahlen!");
	
	Konto1.einzahlen(12.50);	
	Konto2.einzahlen(10.0);
	Konto1.einzahlen(10.0);
	
	System.out.println("Geld auszahlen!");
	
	Konto1.auszahlen(20.0);
	
	System.out.println(" ");
	
	System.out.println("Konto zeige Inhaber:");
	
	String inhaberKonto1 = Konto1.zeigeInhaber ();
	System.out.println("Der Kontoinhaber von Konto 1: " + inhaberKonto1);
	System.out.println("Der KOntoinhaber von Konto 1: " + Konto1.zeigeInhaber());
	
	System.out.println(" ");
	
	System.out.println("Static:");
	
	double summe = UML02_Konto_zusammen.addieren(12.0, 15.0);
	System.out.println(summe);
	
	double differenz = UML02_Konto_zusammen.subtrahieren(10.0, 5.0);
	System.out.println(differenz);
	
	
	
	
	}

}