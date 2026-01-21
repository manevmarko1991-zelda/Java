package marko_manev;

public class UML04_konto_aufgabe_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UML04_Konto_aufgabe konto =new UML04_Konto_aufgabe();
		
		konto.einzahlen(100);
		konto.abheben(30);
		konto.zeigeKontostand();
	}

}
