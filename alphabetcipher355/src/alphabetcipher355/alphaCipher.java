package alphabetcipher355;

import java.util.HashMap;
import java.util.Map;

public class alphaCipher {
	
	private String key;
	private String message;
	private static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static Map<Character, Integer>cipher = new HashMap<Character, Integer>();
	
	public alphaCipher(String key, String message) {
		char a = alphabet[0];
		System.out.print(a);
	}

}
