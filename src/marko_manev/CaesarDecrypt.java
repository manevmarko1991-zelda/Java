package marko_manev;

/*
Funktion decryptCaesarCipher(text: string, shiftValue: int) → string
    Deklariere decryptedText als leere Zeichenkette
    
    Für i von 0 bis text.length - 1 Wiederhole
        asciiCode ← ASCII-Wert von text[i]
        newAsciiCode ← asciiCode - shiftValue
        
        Falls newAsciiCode ≥ 32 Dann
            decryptedText ← decryptedText + Zeichen(newAsciiCode)
        Ende Falls
    Ende Für
    
    Rückgabe decryptedText
Ende Funktion
*/

public class CaesarDecrypt {
 public static void main(String[] args) {
  String encryptedText = "Gdv#lvw#hlq#Wh{w1";
  int shiftValue = 3;

  String decryptedText = decryptCeasarCipher(encryptedText, shiftValue);
  System.out.println("Verschluesselter Text: " + encryptedText);
  System.out.println("Verschiebung: " + shiftValue);
  System.out.println("Klartext: " + decryptedText);
 }
 public static String decryptCeasarCipher(String text, int shiftValue) {
  String decryptedText = "";
  for(int i = 0; i < text.length(); i++) {
   int asciiCode = text.charAt(i);
   int newAsciiCode = asciiCode - shiftValue;
   if (newAsciiCode >= 32) {
    decryptedText += (char)newAsciiCode;
   } 
   else {
    decryptedText += (char)(newAsciiCode + 127 - 32);
   }
  }
  return decryptedText;
 }
}