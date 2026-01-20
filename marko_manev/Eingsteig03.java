package marko_manev;
import java.util.Scanner;

public class Eingsteig03 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		double doubleNumber1 =0.1;

		double doubleNumber2 =0.2;
		double doubleNumber3 =0.3;

		System.out.println(doubleNumber1 + doubleNumber2);
		if(doubleNumber3==doubleNumber1+doubleNumber2) {
		System.out.println("die beiden zahlen sind gleich.");
		}
		else {
			System.out.println("die beiden zahlen sind nicht gleich");
			*/
		/*
		int age = 66;
		 
		if (age < 18) {
			System.out.println("Nicht volljährig");
		} else if (age >= 18 && age < 65) {
			System.out.println("Erwachsen");
		} else {
			System.out.println("Ruhestand");
		*/
		
		Scanner input = new Scanner(System.in);
		System.out.print("Bitte gib eine Tagesnummer ein: ");
		int tagNummer = input.nextInt();
		
		
		String wochentag = "keine gültige Eingabe";
		
 
		switch (tagNummer % 7) {
		case 1:
			wochentag = "Montag";
			break;
		// Vergleich des case ( hier der Wert 1) mit der switch Bedingung
		// (hier tagNummer%7). Wenn die Werte übereinstimmen, dann wird der
		// Codeblock ausgeführt
		// Analog für die weiteren cases
		case 2:
			wochentag = "Dienstag";
			System.out.println("ftornik dosaden den od nedelata");
			break;
		case 3:
			wochentag = "Mittwoch";
			break;
		case 4:
			wochentag = "Donnerstag";
			break;
		case 5:
			wochentag = "Freitag";
			System.out.println("WOCHENENDE!!!! SAUFENN!!!");
			break;
		case 6:
			wochentag = "Samstag";
			break;
		case 0:
			wochentag = "Sonntag";
			System.out.println("Oh nöö morgen ist Montag!");
			break;
		default:
			System.out.println("Ungültiger Wochentag");
			break;
		// der default Bereich wird ausgeführt, wenn keiner der cases zutrifft
		}
		System.out.println("Wir haben aktuell " + wochentag);
		}
	}
		


	

