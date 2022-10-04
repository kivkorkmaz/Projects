public class ReaderTest {
	public static void main(String[] args) {
		Reader reader = new Reader();
		reader.name = "Kivanc";
		reader.age = randomGeneratorAge(7,65);
		reader.sex = randomGeneratorSex();
		System.out.println("Müşteri adi: " + reader.name + " Müşteri Yaşı: " + reader.age +" Müşteri Cinsiyeti: " +  reader.sex);
		Book book = new Book();
		book.author = "Jose Samargo";
		book.name = "Körlük";
		book.page = 240;
		book.isHardCover = randomGeneratorHardCover();
		System.out.println("Kitabın adı: " + book.name + " Kitabın yazarı " + book.author + " kitabın kapağı "  + book.isHardCover + " sayfa sayısı"  + book.page);
		
		Reader reader1 = new Reader("Erkek",26,"Ali");
		Reader reader2 = new Reader("Sevil",28);
	
	
	
	}
		
	public static int randomGeneratorAge(int rangeMax, int rangeMin) {
		return (int) (Math.random()*(rangeMax-rangeMin)) + rangeMin;
	}

		
	public static String randomGeneratorHardCover() {
		if(Math.random()<0.5) {
			return "HardCover";
		}else {
			return "Not HardCover";
		}	
	
	}
	public static String randomGeneratorSex() {
		if(Math.random()<0.5) {
			return "Male";
		}else {
			return "Famale";
		}	
	}
}

