
public class Assignation {

	public static void main(String[] args) {
		Doctor doctor = new Doctor();
		doctor.docName = "Ali Kaplan";
		doctor.no = 1;
		doctor.expertise = "Dentist";
		doctor.sex = "Erkek";
		System.out.println("Doktor Adı: " + doctor.docName + " doktor no: " + doctor.no + " uzmanlık " + doctor.expertise + " cinsiyeti " + doctor.sex);
		System.out.println(" ");
		
		Doctor doctor2 = new Doctor("Sevil Kaplan" , 2);
		System.out.println("Doktor Adı : " + doctor2.docName + " doktor no " + doctor2.no);
		System.out.println(" ");
		
		Doctor doctor3 = new Doctor("Leyla Kaplan", "diyetisyen", 3);
		System.out.println("Doktor Adı : " + doctor3.docName + " uzmanlık " + doctor3.expertise + " no " + doctor3.no);
		System.out.println(" ");
		
		Patient patient = new Patient("Ayşe Fener",25	);
		System.out.println("Hasta Adı : " + patient.name + " yaş " + patient.age);
		System.out.println(" ");
		
		Patient patient1 = new Patient("Sabri Özer",38,1545465465,"Grip");
		System.out.println("Hasta adı : " + patient1.name + " yaş 	" + patient1.age + " TC " + patient1.tckno + " hastalık türü " + patient1.ill);
		
	}

}
