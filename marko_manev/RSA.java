package marko_manev;

import javax.crypto.Cipher;
import java.security.*;
import java.util.Base64;

public class RSA {

    public static void main(String[] args) throws Exception {

        // 1. RSA-Schlüssel erzeugen
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048); // Bit Schluessellaenge
        KeyPair pair = keyGen.generateKeyPair();

        PublicKey publicKey = pair.getPublic();
        PrivateKey privateKey = pair.getPrivate();

        String plainText = "Das ist eine wirklich sehr geheime Nachricht!";

        // 2. Verschlüsseln
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encrypted = cipher.doFinal(plainText.getBytes());
        String encryptedBase64 = Base64.getEncoder().encodeToString(encrypted);

        System.out.println("Verschluesselt: " + encryptedBase64);

        // 3. Entschlüsseln
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(encryptedBase64));
        String decryptedText = new String(decrypted);

        System.out.println("Entschluesselt: " + decryptedText);
    }
}