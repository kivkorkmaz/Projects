
public class SalaryCalculation {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Kıvanç");
		employee.setId(44);
		employee.setDepertmant("Devoloper");
		employee.setWage(8000.5);
		System.out.println("Personel Adı: " + employee.getName() + " personel id: " + employee.getId()
		+ " \nçalıştığı bölüm: " + employee.getDepertmant() + " maaşı : " + employee.getWage());
		System.out.println();
		Employee employee1 = new Employee(1,"Ali","Group Leader");
		employee1.setId(2);
		System.out.println("Personel adı : " + employee1.getName() + " personel id: " + employee1.getId()+
				"\nçalıştığı bölüm: " + employee1.getDepertmant().charAt(0));
		
	}
		
	
}