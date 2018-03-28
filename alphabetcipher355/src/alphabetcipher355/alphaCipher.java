package alphabetcipher355;

import java.util.HashMap;
import java.util.Map;

public class alphaCipher {
	
	private char[] key;
	private char[] message;
	private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static Map<Character, Integer>cipher = new HashMap<Character, Integer>();
	
	public alphaCipher(char[] key, char[] message) {
		//char a = alphabet[0];
		//System.out.print(a);
		this.key = key;
		this.message = message;
		for (int i = 0; i < alphabet.length; i++) {
			cipher.put(alphabet[i],i);
		}
		System.out.println("Encryption: " + encrypt(key, message));
		char[]encryptedMsg = encrypt(key,message).toCharArray();
		System.out.println("Decryption: " + decrypt(key,encryptedMsg));
		
	}
	
	private static String encrypt(char[] phrase, char[] msg) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0, j = 0; i < msg.length; i++, j = (j + 1) % phrase.length) {
			sb.append(alphabet[(cipher.get(msg[i]) + cipher.get(phrase[j])) % alphabet.length]);
			
		}
		return sb.toString();

	}
	
	private static String decrypt(char[] phrase, char[] msg) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0, j = 0; i < msg.length; i++, j = (j + 1) % phrase.length) {
			sb.append(alphabet[(cipher.get(msg[i]) - cipher.get(phrase[j]) + alphabet.length) % alphabet.length]);
			
		}
		return sb.toString();
	}

}
