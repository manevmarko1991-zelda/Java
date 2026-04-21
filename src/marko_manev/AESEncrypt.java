package marko_manev;

import java.util.Base64;
import javax.crypto.*;

public class AESEncrypt {

 public static void main(String[] args) {

  try {
   //-------------------------------------------------
   //Schlüssel erzeugen   
   //-------------------------------------------------
   KeyGenerator keygen = KeyGenerator.getInstance("AES");
   keygen.init(128);
   SecretKey key = keygen.generateKey();
   Cipher cipher = Cipher.getInstance("AES");
   String plainText = "Eine wirklich sehr geheime Nachricht!";
   System.out.println("Originaltext: " + plainText);
   
   //-------------------------------------------------
   // Verschlüsseln   
   //-------------------------------------------------
   cipher.init(Cipher.ENCRYPT_MODE, key);
   byte[] encryptedData = cipher.doFinal(plainText.getBytes());
   String encryptedText = Base64.getEncoder().encodeToString(encryptedData);
   System.out.println("Verschluesselter Text: "  + encryptedText);
   
   //-------------------------------------------------
   // Entschlüsseln   
   //-------------------------------------------------

   cipher.init(Cipher.DECRYPT_MODE, key);
   encryptedData = (Base64.getDecoder().decode(encryptedText));
   byte[] decryptedData = cipher.doFinal(encryptedData);
   String decryptedText = new String(decryptedData);
   System.out.println("Entschluesselter Text: "  + decryptedText);   
  } catch (Exception e) {
   e.printStackTrace();
  }
 }
}
 