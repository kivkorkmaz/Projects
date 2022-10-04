import java.util.Scanner;

public class WordNumb {
	public static void main(String arg[]) {
		int sayac=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cümle Giriniz: ");
		String sentence = scan.nextLine();
		for(int i=0;i<sentence.length();i++) {
				if(sentence.charAt(i)== ' ' ) {
					sayac++;
					
				}
			}
		System.out.println("Cümlede ki kelime sayısı: " + (sayac+1));
	}

}
