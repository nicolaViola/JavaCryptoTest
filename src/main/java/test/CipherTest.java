package test;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class CipherTest {

	public static void main(String[] args) {
		
		try {
			Cipher cipher = Cipher.getInstance("AES");
			
			byte[] keyBytes   = new byte[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
			String algorithm  = "AES";
			SecretKeySpec key = new SecretKeySpec(keyBytes, algorithm);
			
			cipher.init(Cipher.ENCRYPT_MODE, key);
			
			byte[] text = "nicola".getBytes("UTF-8");
			byte[] cipherText = cipher.doFinal(text);
			
			
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] originalText = cipher.doFinal(cipherText);
			
			System.out.print("");
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
		} catch (InvalidKeyException e) {
		e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print("done");
	}

}
