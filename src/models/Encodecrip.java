package models;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;
import org.apache.commons.codec.binary.Base64;


public class Encodecrip {
    String secretKey = "1234";

    public String encode(String chain) {
        String encriptacion = "";
        try {
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            byte[] llavePassword = sha.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(llavePassword, 16);
            SecretKey key = new SecretKeySpec(keyBytes, "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainTextBytes = chain.getBytes("utf-8");
            byte[] buf = cipher.doFinal(plainTextBytes);
            byte[] base64Bytes = Base64.encodeBase64(buf);
            encriptacion = new String(base64Bytes);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error en la Encriptación, vuelva a intentarlo.");
        }
        return encriptacion;
    }

    public String desencode(String shaincrip) {
        String desencriptacion = "";
        try {
            byte[] message = Base64.decodeBase64(shaincrip.getBytes("utf-8"));
            MessageDigest sha = MessageDigest.getInstance("SHA-256");
            byte[] digestOfPassword = sha.digest(secretKey.getBytes("utf-8"));
            byte[] keyBytes = Arrays.copyOf(digestOfPassword, 16);
            SecretKey key = new SecretKeySpec(keyBytes, "AES");
            Cipher decipher = Cipher.getInstance("AES");
            decipher.init(Cipher.DECRYPT_MODE, key);
            byte[] plainText = decipher.doFinal(message);
            desencriptacion = new String(plainText, "UTF-8");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al desencriptar");
        }
        return desencriptacion;
    }
}
