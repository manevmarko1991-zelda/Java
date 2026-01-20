package marko_manev;

public class Einsteig04_Mathe_aufgabe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*	for (int i = 1; i <= 20; i=i+1)
			// Erster Teil: Zählerinitialisierung, meist auf 0, gilt nur für DIESE schleife
			// Zweiter Teil: Abbruchbedingung, solange true finde ein Durchlauf statt
			// Dritter Teil: Schrittweite des Zählers am Ende eines Durchlaufes
			// i++ ist das gleiche wie i = i+1
			System.out.println(i);
*/
//aufgabe:sie haben ein zahlerschleife und wollen in 1ner shritten hochzahlen,welche der lösung sind richtig
/*		int i = 0 ;
		int j = 20 ;
		while(true) {
			System .out.println(i);
		i++;
		if(i>=j){
			break;
		*/
		
		// Fußgesteuerte Schleife
		int iZaehler = 8;
		do {
			if (iZaehler < 10) {
				System.out.println("Zähler kleiner 10! " + iZaehler);
				iZaehler++;
			} else {
				System.out.println("Zähler größer/gleich 10! " + iZaehler);
				iZaehler += 2;
			}
		} while (iZaehler <= 20);
		// bei einer fußgesteuerten Schleife wird erst NACH dem Durchlauf
		// Die Schleife wird alse IMMMER mindestens einmal durchlaufen
		// die Bedingung geprüft. Falls ja, wird an den Anfang von do gesprungen.
		// Falls nein, wird die Schleife abgebrochen
	}}

