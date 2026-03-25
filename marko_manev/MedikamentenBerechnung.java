package marko_manev;



public class MedikamentenBerechnung {

// Rekursive Funktion zur Berechnung der Medikamentenmenge am n-ten Tag
public static double medikamentenmenge(int n) {
// Basisfall: Am ersten Tag ist nur die tägliche Dosis von 5 mg vorhanden
if (n == 0) {
return 0; // Kein Medikament im Korper vor der ersten Einnahme
}
// Rekursiver Fall: Hinzufügen der neuen Dosis + 60% der Restmenge vom Vortag
return medikamentenmenge(n - 1) * 0.6 + 5;
}
public static void main(String[] args) {
// Testen der Funktion mit mehreren Tagen
System.out.println("Medikamentenmenge am 1. Tag: " + String. format("%.1f", medikamentenmenge(1)) + " mg");
System.out.println("Medikamentenmenge am 2. Tag: " + String. format("%.1f", medikamentenmenge(2)) + " mg") ; 
System.out.println("Medikamentenmenge am 4. Tag: " + String.format("%.1f", medikamentenmenge(4)) + " mg");
System.out.println("Medikamentenmenge am 5. Tag: " + String. format("%.1f", medikamentenmenge(5)) + " mg");
System.out.println("Medikamentenmenge am 10. Tag: " + String. format("%.2f", medikamentenmenge(10)) + " mg") ;
}}
