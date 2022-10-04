import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		String word1 = null;
		String word2 = null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci Kelimeyi Girin: ");
		word1 = scan.nextLine();
		System.out.println("İkinci Kelimeyi Girin: ");
		word2 = scan.nextLine( );
		System.out.println("Birinci ve İkinci Kelimenin Birleşmiş Hali: " + word1.concat(word2));

	}

}
