package marko_manev;

public class UML03_Tier_Main_zusammen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	UML03_Schnabeltier_zusammen Schnabeltier = new UML03_Schnabeltier_zusammen();
	System.out.println("  schanbeltier ");
	Schnabeltier.lautGeben();
	Schnabeltier.name ="Perry";
	Schnabeltier.alter = 3;
	Schnabeltier.groesse= 37;
	Schnabeltier.geschlecht ="m";
	Schnabeltier.fliegen= true;
	Schnabeltier.anzahlEier = 0;
	Schnabeltier.zeigeInfo();
	UML03_Hund_zusammen Hund = new UML03_Hund_zusammen();
	System.out.println("=== Hund ===");
	Hund.name="Rex";
	Hund.alter=38;
	Hund.groesse = 50;
	Hund.jagdtrieb = true;
	Hund.geschlecht ="m";
	Hund.Fellfarbe = "braun mit den typischen  schwarzen grossen flecken";
	Hund.Stubenrein =false;
	Hund.gewicht = 33;
	Hund.lautGeben();
	Hund.gibpfote();
	Hund.zeigeInfo();
	
	
	}

}
