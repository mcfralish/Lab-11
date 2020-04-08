
public class Student extends Human{
	
	private String major;
	private double gpa;
	private int creditHours;
	
	public Student(String major, double gpa, int creditHours, double height, double weight, int age) {
		super(height, age, weight);
		this.gpa = gpa;
		this.major = major;
		this.creditHours = creditHours;
	}
	
	public String getMajor() {
		return major;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public String getYear() {
		if (creditHours>=96) return "Senior";
		else if (creditHours<96&&creditHours>=64) return "Junior";
		else if (creditHours<64&&creditHours>=32) return "Sophomore";
		else return "Freshmen";
	}
}
