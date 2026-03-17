package marko_manev;
/* Create an Account class. In this class, create the attributes accountNumber and accountBalance. Use appropriate data types and set initial values if necessary.
In addition, implement the methods deposit(), withdraw(), and showAccountBalance(). If necessary, consider parameters that should be passed to the function.
Create a main method in the class and create an account. Use your methods to deposit €100, withdraw €30, and display the account balance.
*/
public class UML04_Konto_aufgabe {
	int kontonummer;
	double kontostand = 0;
	void einzahlen (double betrag) {
		if (betrag > 0) {
		kontostand += betrag;
		
		}}
	void abheben(double betrag) {
	if (betrag <= kontostand) {
		kontostand -= betrag;}
			else  {System.out.println("nicht genügend Guthaben!");}
	}
	void zeigeKontostand() {
		System.out.println("kontostand :"+ kontostand + "€");}
	
	
	}

