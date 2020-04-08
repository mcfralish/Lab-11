
public class Doctor extends Human{
	
	private int years;
	private String specialty;
	
	public Doctor(String specialty, int years, double height, double weight, int age) {
		super(height, age, weight);
		this.years = years;
		this.specialty = specialty;	
	}
	
	public int getYears() {
		return years;
	}
	
	public String getSpecialty() {
		return specialty;
	}
	
	public int getSalary() {
		return (40+5*(years-1))*1000;
	}
}
