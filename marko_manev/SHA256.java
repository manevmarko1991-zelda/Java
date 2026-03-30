package marko_manev;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class SHA256 {
 public static void main(String[] args) {
   try {  
  String password = "Mein Passwort";
  MessageDigest digest = MessageDigest.getInstance("SHA-256");
  byte[] encodedPassword = digest.digest(password.getBytes(StandardCharsets.UTF_8));
  BigInteger no = new BigInteger(1, encodedPassword); 
        // TODO
        System.out.println("Passwort: " + password);
        System.out.println("Hashwert: " + hashValue);
   } catch (Exception e) {
    e.printStackTrace();
   }
 }
}