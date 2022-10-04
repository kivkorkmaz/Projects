import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Kelime Giriniz: ");
		String word1 = scan.nextLine();
		char[] charArray = word1.toCharArray();
		System.out.println("Kaçıncı Dizi Çıktısı Alınsın: ");
		for (char ch: word1.toCharArray()) {
			int i = scan.nextInt();
			if(i<=0 || word1.length()<i) {
				System.out.println("Eksik veya hatalı bir sayı girdiniz");
			}else {
				System.out.println(word1.charAt(i-1));
			}
			break;
	  }
		
	}
}
