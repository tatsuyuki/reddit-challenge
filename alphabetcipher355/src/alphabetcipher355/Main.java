package alphabetcipher355;
import java.util.Scanner;


public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter keyword");
		char[] n = reader.nextLine().toCharArray();
		System.out.println("Enter phrase");
		char[] m = reader.nextLine().toCharArray();
		
		alphaCipher alphaC = new alphaCipher(n, m);	
		

	}
	
	

}

