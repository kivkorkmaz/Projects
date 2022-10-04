
public class CompareTo {
	public static void main(String[] args) {
	String word1 = "Malatya";
	String word2 = "Malatdd";
	System.out.println(word1.compareTo(word2));
	if(word1.length()==word2.length()) {
	System.out.println("Karakter Sayısı Birbirine Eşittir.");	
	} else if(word1.length()> word2.length()) {
		System.out.println("Word1 daha fazla karaktere sahiptir");
	}else {
		System.out.println("Word2 daha fazla karaktere sahiptir.");
	}
  }
}