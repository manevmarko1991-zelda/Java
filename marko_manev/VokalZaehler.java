package marko_manev;

/*
Beispiel text = "Hallo"; [H,a,l,l,o]; length = 5
index 4  -> vz("Hallo", 4) c = "o" count = 1  -> 1 + 1 = 2
index 3  -> vz("Hallo", 3) c = "l" count = 0  -> 0 + 1 = 1
index 2  -> vz("Hallo", 2) c = "l" count = 0  -> 1 + 0 = 1
index 1  -> vz("Hallo", 1) c = "a" count = 1  -> 0 + 1 = 1
index 0  -> vz("Hallo", 0) c = "H" count = 0  -> 0 + 0 = 0
index -1 -> vz("Hallo", -1)                   -> 0
*/

import java.util.Scanner;

public class VokalZaehler {

   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Bitte geben Sie einen Text ein:");
       String text = scanner.nextLine();
       scanner.close();

       int anzahlVokale = zaehleVokale(text, text.length() - 1, 0);  // Rekursion mit Tiefe starten
       System.out.println("Anzahl der Vokale: " + anzahlVokale);
   }

   public static int zaehleVokale(String text, int index, int tiefe) {
       // Abbruchbedingung: Wenn der Index kleiner als 0 ist, gibt es keine weiteren Buchstaben
       if (index < 0) {
           return 0;
       }

       // Der aktuelle Buchstabe
       char c = Character.toLowerCase(text.charAt(index));  // Buchstabe in Kleinbuchstaben umwandeln
       int count = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? 1 : 0;  // Vokalprüfungslogik

       // Ausgabe der Rekursionstiefe, Methode-Aufruf, aktueller Index, der betrachtete Buchstabe und count
       System.out.println("Rekursionstiefe: " + tiefe + " -> zaehleVokale(" + index + ", " + tiefe + "), aktueller Buchstabe: '" + text.charAt(index) + "', count: " + count);

       // Rekursiver Aufruf mit dem nächsten Buchstaben und Erhöhung der Rekursionstiefe
       return zaehleVokale(text, index - 1, tiefe + 1) + count;
   }
}

