
public class Lab11 {

	public static void main(String[] args) {
		
		Student alex = new Student("CS", 3.4, 54, 170, 150, 18);
		
		Doctor jack = new Doctor("Dermatology", 4, 173, 179, 40);
		
		System.out.println(alex.getMajor());
		System.out.println(alex.getGPA());
		System.out.println(alex.getYear());
		System.out.println(alex.getAge());
		
		System.out.println(jack.getSpecialty());
		System.out.println(jack.getHeight()+" lbs");
		System.out.println(jack.getWeight()+" cm");
		System.out.println("$"+jack.getSalary());
		
		Mammal mam1 = jack;
		//System.out.println(mam1.getSalary);
		
		Human hum1 = alex;
		System.out.println(hum1.getHeight());
		
		Mammal mam2 = jack;
		System.out.println(mam2.getWeight());
	}

}
