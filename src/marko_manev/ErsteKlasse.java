package marko_manev;

import java.util.Scanner;

public class ErsteKlasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("hallo world");
	
	Scanner nutzerEingabe = new Scanner(System.in);
	
	
	System.out.print("Bitte gebe deinen Namen ein:");
	
	String username = nutzerEingabe.nextLine();
	
	System.out.println("Eingabe: " + username);
	
	System.out.println("Bitte gebe dein Alter ein :");
	
	int useralter = nutzerEingabe.nextInt();
	
	System.out.println("Alter:" + useralter);
	nutzerEingabe.close();
	}

}
/* hallo ich bin ein kommentar 
/gasgasgas
asgfasgfas
gfasfas*/
//haloo	
