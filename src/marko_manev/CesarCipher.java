package marko_manev;

public class CesarCipher {
	 public static void main(String[] args) {
	  String text = "Das ist ein Text.";
	     int shiftValue = 3;
	  String encryptedText = encryptCeasarCipher(text, shiftValue);
	  System.out.println("Klartext: " + text);
	  System.out.println("Verschiebung: " + shiftValue);
	  System.out.println("Verschluesselter Text: " + encryptedText);
	 }

	 static String encryptCeasarCipher(String text, int shiftValue) {
	     String encryptedText = "";
	     for(int i = 0; i < text.length(); i++) {
	         int asciiCode = text.charAt(i);
	         int newAsciiCode = asciiCode + shiftValue;
	         if (newAsciiCode < 127) {
	             encryptedText += (char)newAsciiCode;
	         } else {
	             encryptedText += (char)(newAsciiCode % 127 + 32);
	         }
	     }
	     return encryptedText;
	 }
	}