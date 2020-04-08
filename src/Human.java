
public class Human extends Mammal{
	
	private double height;
	
	public Human(double height, int age, double weight) {
		super(weight,age);
		this.height = height;		
	}


	public double getHeight() {
		return height;
	}
}
