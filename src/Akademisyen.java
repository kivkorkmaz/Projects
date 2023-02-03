 
public class Akademisyen extends Workers {
	
	String bolum,gorevler;
	String  dersler;
	
	public Akademisyen(String adSoyad, String eposta, String telefon,String bolum, String gorevler, String dersler) {
		super(adSoyad,eposta,telefon);
		this.bolum = bolum;
		this.gorevler = gorevler;
		this.dersler = dersler;
	}

	public void derseGir() {
		System.out.println("Derse Girildi...");
	}
}
