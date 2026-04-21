package marko_manev;

public class UML03_Tier {
	//Attribute
	String geschlecht;
	double groesse = 100;
	double gewicht;
	boolean jagdtrieb;
	String name;
	int alter;

	//Methoden
	public void lautGeben() {
		System.out.println("generischer Tierlaut");
	}
	
	public void zeigeInfo() {
        System.out.println("Name: " + name + ", Alter: " + alter + " Jahre");
        System.out.println("Geschlecht: " + geschlecht + ", Größe: " + groesse + " cm, Gewicht: " + gewicht + "kg");
        System.out.println("Jagdtrieb: " + (jagdtrieb ? "Ja" : "Nein"));
    }
}



