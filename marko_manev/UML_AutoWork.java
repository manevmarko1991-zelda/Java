package marko_manev;

public class UML_AutoWork {
	// Hier ist diese Klasse wie in den Klassendiagrammen
	// Wir stellen hier Eigenschaften dar.
	// Und wir stellen das Verhalten dar.
	// Ein Klasse ist nur eine Vorlage für die Allgemeinheit
	// Hier wird eine Vorlage für ein Auto definiert
	 
	
	 
			// public bedeutet, dass jede andere Klasse ersteinmal auf sIe zugreifen kann
			// Attribute (Eigenschaften) festlegen bzw deklariert
	int baujahr;				
	 int kilometerstand;		
	 String kraftstoffart;		
	 boolean automatik;
	 String farbe;				
	 boolean kleinwagen;
	 boolean sitzheizung;		
	 boolean lenkradheizung;
	 int hubraum;				
	 String marke;				
	 String modell;				
	 String getriebe;    		
	 double motorps;			
	 String antriebsart;			
	 String ausstattung;
	 int achsen;
	 int raeder;
	 int Tueren;				
	 int Sitze;
	 boolean cabrio;
	 int modellNummer;
	 String preis;
	 int maxGeschwindigkeit;
	 int Verbrauch;
	 int gewicht;
	 double groeße;
	 int modelljahr = 2005;

	
	
	
	
	 // --- METHODE FÜR DIE AUSGABE ---
	 	
	    public void printInfo() {
	    	 System.out.println("======= FAHRZEUGDETAILS =======");
	    	    
	    	    // Nur drucken, wenn ein Wert vorhanden ist (!= null)
	    	    if (marke != null)         System.out.println("Marke:         " + marke);
	    	    if (modell != null)        System.out.println("Modell:        " + modell);
	    	    if (preis != null)         System.out.println("Preis:         " + preis + " €");

	    	    
	    	    // Nur drucken, wenn die Zahl nicht 0 ist
	    	    if (baujahr != 0)          System.out.println("Baujahr:       " + baujahr);
	    	    if (getriebe != null)      System.out.println("Getriebe:      " + getriebe);
	    	    if (motorps != 0)          System.out.println("Motorleistung: " + motorps + " PS");
	    	    if (hubraum != 0)          System.out.println("Hubraum:       " + hubraum + " cm³");
	    	    if (Tueren != 0)           System.out.println("Anzahl Türen:  " + Tueren);
	    	    if (kilometerstand != 0)   System.out.println("Kilometerstand:" + kilometerstand + " km");
	    	    if (kraftstoffart != null) System.out.println("Kraftstoff:    " + kraftstoffart);
	    	    if (farbe != null)         System.out.println("Farbe:         " + farbe);
	    	    
	    	    // Booleans: Nur drucken, wenn sie 'true' sind
	    	    if (sitzheizung)           System.out.println("Sitzheizung:   Ja");
	    	    if (antriebsart != null)   System.out.println("Antriebsart:   " + antriebsart);
	    	    if (ausstattung != null)   System.out.println("Ausstattung:   " + ausstattung);
	    	    
	    	    if (achsen != 0)           System.out.println("Achsen:        " + achsen);
	    	    if (raeder != 0)           System.out.println("Räder:         " + raeder);
	    	    if (maxGeschwindigkeit != 0) System.out.println("vMax:          " + maxGeschwindigkeit + " km/h");
	    	    if (Verbrauch != 0)        System.out.println("Verbrauch:     " + Verbrauch + " L/100km");
	    	    if (gewicht != 0)          System.out.println("Gewicht:       " + gewicht + " kg");

	    	    System.out.println("-------------------------------");
	    }
	    

	    
	    
	    
	    
	    
	    // Methoden
	    void fahren() { System.out.println("brumm brumm"); }
	    String sagen() { return "ich bin Doougie"; }
	
}
