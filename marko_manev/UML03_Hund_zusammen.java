package marko_manev;

public class UML03_Hund_zusammen extends UML03_Tier {
	//subklasse hund soll von kalsse tier erben => extends!
	// alle methdoden und atribute der oberklasse /superklasse/elternklasse werden ubernomen=geerbt
	//methode und attribute werden in diese kalsse kopiert
	
//eigene atribute von hund
	String Fellfarbe;
	String rasse;
	boolean Stubenrein;
	double Lautstaerkebellen;
	//eigene methdoden 
	void gibpfote() {
		System.out.println(name +"gibt Pfote.aww wie suS!");
	}
	public void lautGeben() {
		System.out.println("wulf wulf");
	}
}

	
