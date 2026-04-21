package marko_manev;

/* 
Beispiel: Zinseszinsen nach Ablauf des 4. Jahres
 n = 4  ->  k(4)  ->  1157.63 + 0.05 * 1157.63 = 1215.51
 n = 3  ->  k(3)  ->  1102.50 + 0.05 * 1102.50 = 1157.63
 n = 2  ->  k(2)  ->  1050.00 + 0.05 * 1050.00 = 1102.50
 n = 1  ->  k(1)  ->  1000.00 + 0.05 * 1000 = 1050.00
 n = 0  ->  k(0)  ->  1000.00
*/


public class Zinseszins {

    // Rekursive Funktion zur Berechnung des Kapitals nach n Jahren
    public static double kapital(int n) {
        // Basisfall: Nach 0 Jahren ist das Kapital 1000 Euro
        if (n == 0) {
            return 1000;
        }
        // Rekursiver Fall: kapital(n-1)
        double vorherigesKapital = kapital(n - 1);
        return vorherigesKapital + 0.05 * vorherigesKapital;
    }

    public static void main(String[] args) {
        // Testen der Funktion mit mehreren Funktionsaufrufen
     System.out.println("Kapital nach 0 Jahren: " + String.format("%.2f", kapital(0)));
     System.out.println("Kapital nach 1 Jahr: " + String.format("%.2f", kapital(1)));
     System.out.println("Kapital nach 4 Jahren: " + String.format("%.2f", kapital(4)));
     System.out.println("Kapital nach 30 Jahren: " + String.format("%.2f", kapital(30)));
    }
}