
public class Main {
 
	public static void main (String [] args) {
		
		Akademisyen a = new Akademisyen("Kıvanç", "k@gmail.com", "05555555","NTBP","DR","B22");
		System.out.println(a.getAdSoyad());
		
		OgretimUyesi o = new OgretimUyesi("Ali","a@gmail.com","0000","Java","JV","J103","Doçent");
		o.giris();
		
		Workers b = new OgretimUyesi("Sevil","s@gmail.com","0000","Java","JV","J103","Doçent");
	}	
}