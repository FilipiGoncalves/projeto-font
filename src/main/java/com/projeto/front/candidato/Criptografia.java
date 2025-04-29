package com.projeto.front.candidato;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Criptografia {
    
    private static final String CHAVE = "1234567890123456"; // 16 caracteres para AES-128

    public static String criptografar(String senha) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(CHAVE.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypted = cipher.doFinal(senha.getBytes());
        return Base64.getEncoder().encodeToString(encrypted);
    }

    public static String descriptografar(String senhaCriptografada) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(CHAVE.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypted = cipher.doFinal(Base64.getDecoder().decode(senhaCriptografada));
        return new String(decrypted);
    }
}
